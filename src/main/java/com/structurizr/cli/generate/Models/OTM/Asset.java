package com.structurizr.cli.generate.Models.OTM;

public class Asset {
    private String name;
    private String id;
    private String description;
    private AssetRisk risk;
    private Object attributes;
    private Long riskReduction;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public AssetRisk getRisk() { return risk; }
    public void setRisk(AssetRisk value) { this.risk = value; }

    public Object getAttributes() { return attributes; }
    public void setAttributes(Object value) { this.attributes = value; }

    public Long getRiskReduction() { return riskReduction; }
    public void setRiskReduction(Long value) { this.riskReduction = value; }
}
