package com.structurizr.cli.generate.Models.OTM;

import java.util.UUID;

public class TrustZone {
    private String name;
    private UUID id;
    private String type;
    private String description;
    private TrustZoneRisk risk;
    private TrustZoneRepresentation[] representations;
    private Object attributes;
    private Parent parent;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public UUID getID() { return id; }
    public void setID(UUID value) { this.id = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public TrustZoneRisk getRisk() { return risk; }
    public void setRisk(TrustZoneRisk value) { this.risk = value; }

    public TrustZoneRepresentation[] getRepresentations() { return representations; }
    public void setRepresentations(TrustZoneRepresentation[] value) { this.representations = value; }

    public Object getAttributes() { return attributes; }
    public void setAttributes(Object value) { this.attributes = value; }

    public Parent getParent() { return parent; }
    public void setParent(Parent value) { this.parent = value; }
}
