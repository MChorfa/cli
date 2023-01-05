package com.structurizr.cli.generate.Models.OTM;

public class Representation {
    private String name;
    private String id;
    private String type;
    private Size size;
    private Object attributes;
    private Repository repository;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public Size getSize() { return size; }
    public void setSize(Size value) { this.size = value; }

    public Object getAttributes() { return attributes; }
    public void setAttributes(Object value) { this.attributes = value; }

    public Repository getRepository() { return repository; }
    public void setRepository(Repository value) { this.repository = value; }
}
