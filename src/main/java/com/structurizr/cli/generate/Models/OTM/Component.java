package com.structurizr.cli.generate.Models.OTM;

public class  Component {
    private String name;
    private String id;
    private String description;
    private Parent parent;
    private String type;
    private String[] tags;
    private ComponentRepresentation[] representations;
    private Assets assets;
    private ComponentThreat[] threats;
    private Object attributes;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public Parent getParent() { return parent; }
    public void setParent(Parent value) { this.parent = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String[] getTags() { return tags; }
    public void setTags(String[] value) { this.tags = value; }

    public ComponentRepresentation[] getRepresentations() { return representations; }
    public void setRepresentations(ComponentRepresentation[] value) { this.representations = value; }

    public Assets getAssets() { return assets; }
    public void setAssets(Assets value) { this.assets = value; }

    public ComponentThreat[] getThreats() { return threats; }
    public void setThreats(ComponentThreat[] value) { this.threats = value; }

    public Object getAttributes() { return attributes; }
    public void setAttributes(Object value) { this.attributes = value; }
}
