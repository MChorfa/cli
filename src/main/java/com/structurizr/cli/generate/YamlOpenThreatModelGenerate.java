package com.structurizr.cli.generate;

import com.structurizr.cli.generate.Models.WorkspaceGenerate;

public class YamlOpenThreatModelGenerate extends WorkspaceGenerate {

    public YamlOpenThreatModelGenerate(String definition) {
        super(definition);
    }

    @Override
    public String getFileExtension() {
        return "yaml";
    }

}
