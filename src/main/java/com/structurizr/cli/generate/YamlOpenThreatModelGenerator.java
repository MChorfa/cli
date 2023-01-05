package com.structurizr.cli.generate;

import com.structurizr.Workspace;
import com.structurizr.cli.generate.Models.WorkspaceGenerate;
import com.structurizr.cli.generate.Models.WorkspaceGenerator;
import com.structurizr.util.WorkspaceUtils;


public class YamlOpenThreatModelGenerator implements WorkspaceGenerator {

    @Override
    public WorkspaceGenerate generate(Workspace workspace) {
        try {
            return new YamlOpenThreatModelGenerate(WorkspaceUtils.toJson(workspace, true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
