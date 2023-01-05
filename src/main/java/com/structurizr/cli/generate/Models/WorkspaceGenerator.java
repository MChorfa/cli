package com.structurizr.cli.generate.Models;
import com.structurizr.Workspace;

public interface WorkspaceGenerator extends Generator {

    /**
     * Exports the entire workspace to a single String.
     *
     * @param workspace     the workspace to be exported
     * @return  a String generate of the workspace
     */
    WorkspaceGenerate generate(Workspace workspace);

}