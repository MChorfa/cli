package com.structurizr.cli.generate.Models;

public abstract class WorkspaceGenerate {
    private String definition;

    public WorkspaceGenerate(String definition) {
        this.definition = definition;
    }

    public String getDefinition() {
        return definition;
    }

    public abstract String getFileExtension();
}

