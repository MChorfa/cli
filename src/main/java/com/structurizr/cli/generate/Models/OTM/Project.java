package com.structurizr.cli.generate.Models.OTM;

public class Project {
    private String name;
    private String id;
    private String description;
    private String owner;
    private String ownerContact;
    private Attributes attributes;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String getOwner() { return owner; }
    public void setOwner(String value) { this.owner = value; }

    public String getOwnerContact() { return ownerContact; }
    public void setOwnerContact(String value) { this.ownerContact = value; }

    public Attributes getAttributes() { return attributes; }
    public void setAttributes(Attributes value) { this.attributes = value; }
}
