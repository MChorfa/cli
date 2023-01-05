package com.structurizr.cli.generate.Models.OTM;

public class ComponentRepresentation {
    private String representation;
    private String id;
    private Position position;
    private Size size;
    private String representationPackage;
    private String file;
    private Long line;
    private String codeSnippet;

    public String getRepresentation() { return representation; }
    public void setRepresentation(String value) { this.representation = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public Position getPosition() { return position; }
    public void setPosition(Position value) { this.position = value; }

    public Size getSize() { return size; }
    public void setSize(Size value) { this.size = value; }

    public String getRepresentationPackage() { return representationPackage; }
    public void setRepresentationPackage(String value) { this.representationPackage = value; }

    public String getFile() { return file; }
    public void setFile(String value) { this.file = value; }

    public Long getLine() { return line; }
    public void setLine(Long value) { this.line = value; }

    public String getCodeSnippet() { return codeSnippet; }
    public void setCodeSnippet(String value) { this.codeSnippet = value; }
}
