package com.structurizr.cli.generate.Models.OTM;

import java.util.UUID;

public class Threat {
    private String name;
    private UUID id;
    private String description;
    private String[] categories;
    private String[] cwes;
    private ThreatRisk risk;
    private Object attributes;
    private String[] tags;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public UUID getID() { return id; }
    public void setID(UUID value) { this.id = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String[] getCategories() { return categories; }
    public void setCategories(String[] value) { this.categories = value; }

    public String[] getCwes() { return cwes; }
    public void setCwes(String[] value) { this.cwes = value; }

    public ThreatRisk getRisk() { return risk; }
    public void setRisk(ThreatRisk value) { this.risk = value; }

    public Object getAttributes() { return attributes; }
    public void setAttributes(Object value) { this.attributes = value; }

    public String[] getTags() { return tags; }
    public void setTags(String[] value) { this.tags = value; }
}
