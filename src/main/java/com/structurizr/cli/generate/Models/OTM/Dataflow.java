package com.structurizr.cli.generate.Models.OTM;

public class Dataflow {
    private String name;
    private String id;
    private boolean bidirectional;
    private String source;
    private String destination;
    private String[] tags;
    private String[] assets;
    private Object representations;
    private ComponentThreat[] threats;
    private Object attributes;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public boolean getBidirectional() { return bidirectional; }
    public void setBidirectional(boolean value) { this.bidirectional = value; }

    public String getSource() { return source; }
    public void setSource(String value) { this.source = value; }

    public String getDestination() { return destination; }
    public void setDestination(String value) { this.destination = value; }

    public String[] getTags() { return tags; }
    public void setTags(String[] value) { this.tags = value; }

    public String[] getAssets() { return assets; }
    public void setAssets(String[] value) { this.assets = value; }

    public Object getRepresentations() { return representations; }
    public void setRepresentations(Object value) { this.representations = value; }

    public ComponentThreat[] getThreats() { return threats; }
    public void setThreats(ComponentThreat[] value) { this.threats = value; }

    public Object getAttributes() { return attributes; }
    public void setAttributes(Object value) { this.attributes = value; }
}
