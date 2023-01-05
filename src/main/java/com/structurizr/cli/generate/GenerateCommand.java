package com.structurizr.cli.generate;

import com.structurizr.Workspace;
import com.structurizr.cli.AbstractCommand;
import com.structurizr.cli.generate.Models.Generator;
import com.structurizr.dsl.StructurizrDslParser;

import com.structurizr.util.WorkspaceUtils;
import com.structurizr.view.ThemeUtils;

import org.apache.commons.cli.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GenerateCommand extends AbstractCommand {

    private static final Log log = LogFactory.getLog(GenerateCommand.class);

    private static final String YAML_FORMAT = "yaml";
    private static final String OTM_TYPE = "otm";


    private static final Map<String,Generator> GENERATORS = new HashMap<>();

    static {
        GENERATORS.put(YAML_FORMAT, new YamlOpenThreatModelGenerator());

    }

    public GenerateCommand() {
    }

    public void run(String... args) throws Exception {
        Options options = new Options();

        Option option = new Option("w", "workspace", true, "Path or URL to the workspace JSON file/DSL file(s)");
        option.setRequired(true);
        options.addOption(option);

        option = new Option("t", "type", true, String.format("Generation type: %s", OTM_TYPE));
        option.setRequired(true);
        options.addOption(option);

        option = new Option("o", "output", true, "Path to an output directory");
        option.setRequired(false);
        options.addOption(option);

        CommandLineParser commandLineParser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        String workspacePathAsString = null;
        File workspacePath = null;
        long workspaceId = 1;
        String format = "";
        String outputPath = null;

        try {
            CommandLine cmd = commandLineParser.parse(options, args);

            workspacePathAsString = cmd.getOptionValue("workspace");
            format = cmd.getOptionValue("type");
            outputPath = cmd.getOptionValue("output");

        } catch (ParseException e) {
            log.error(e.getMessage());
            formatter.setWidth(150);
            formatter.printHelp("generate", options);

            System.exit(1);
        }

        Workspace workspace;

        log.info("Converting workspace from " + workspacePathAsString);

        if (workspacePathAsString.endsWith(".json")) {
            log.info(" - loading workspace from JSON");

            if (workspacePathAsString.startsWith("http://") || workspacePathAsString.startsWith("https")) {
                String json = readFromUrl(workspacePathAsString);
                workspace = WorkspaceUtils.fromJson(json);
                workspacePath = new File(".");
            } else {
                workspacePath = new File(workspacePathAsString);
                workspace = WorkspaceUtils.loadWorkspaceFromJson(workspacePath);
            }

        } else {
            log.info(" - loading workspace from DSL");
            StructurizrDslParser structurizrDslParser = new StructurizrDslParser();

            if (workspacePathAsString.startsWith("http://") || workspacePathAsString.startsWith("https")) {
                String dsl = readFromUrl(workspacePathAsString);
                structurizrDslParser.parse(dsl);
                workspacePath = new File(".");
            } else {
                workspacePath = new File(workspacePathAsString);
                structurizrDslParser.parse(workspacePath);
            }

            workspace = structurizrDslParser.getWorkspace();
        }

        workspaceId = workspace.getId();


        if (outputPath == null) {
            outputPath = new File(workspacePath.getCanonicalPath()).getParent();
        }

        File outputDir = new File(outputPath);
        outputDir.mkdirs();

        Generator generateer = findGenerator(format);

        if (generateer == null) {
            log.info(" - unknown generate format: " + format);
        } else {
            log.info(" - generateing with " + generateer.getClass().getSimpleName());

            // if (generateer instanceof DiagramGenerator) {
            //     DiagramGenerator diagramGenerator = (DiagramGenerator) generateer;

            //     if (workspace.getViews().isEmpty()) {
            //         log.info(" - the workspace contains no views");
            //     } else {
            //         Collection<Diagram> diagrams = diagramGenerator.generate(workspace);

            //         for (Diagram diagram : diagrams) {
            //             File file = new File(outputPath, String.format("%s-%s.%s", prefix(workspaceId), diagram.getKey(), diagram.getFileExtension()));
            //             writeToFile(file, diagram.getDefinition());

            //             if (diagram.getLegend() != null) {
            //                 file = new File(outputPath, String.format("%s-%s-key.%s", prefix(workspaceId), diagram.getKey(), diagram.getFileExtension()));
            //                 writeToFile(file, diagram.getLegend().getDefinition());
            //             }

            //             if (!diagram.getFrames().isEmpty()) {
            //                 int index = 1;
            //                 for (Diagram frame : diagram.getFrames()) {
            //                     file = new File(outputPath, String.format("%s-%s-%s.%s", prefix(workspaceId), diagram.getKey(), index, diagram.getFileExtension()));
            //                     writeToFile(file, frame.getDefinition());
            //                     index++;
            //                 }
            //             }
            //         }
            //     }
            // }
        }

        log.info(" - finished");
    }

    private Generator findGenerator(String format) {
        if (GENERATORS.containsKey(format.toLowerCase())) {
            return GENERATORS.get(format.toLowerCase());
        }

        try {
            Class<?> clazz = Class.forName(format);
            if (Generator.class.isAssignableFrom(clazz)) {
                return (Generator) clazz.getDeclaredConstructor().newInstance();
            }
        } catch (ClassNotFoundException e) {
            log.error(" - unknown generate format: " + format);
        } catch (Exception e) {
            log.error(" - error creating instance of " + format, e);
        }

        return null;
    }

    private String prefix(long workspaceId) {
        if (workspaceId > 0) {
            return "structurizr-" + workspaceId;
        } else {
            return "structurizr";
        }
    }

    private void writeToFile(File file, String content) throws Exception {
        log.info(" - writing " + file.getCanonicalPath());

        BufferedWriter writer = Files.newBufferedWriter(file.toPath(), StandardCharsets.UTF_8);
        writer.write(content);
        writer.flush();
        writer.close();
    }

}
