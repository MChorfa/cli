package com.structurizr.cli.generate.Models.OTM;

public class AssetRisk {
    private long confidentiality;
    private long integrity;
    private long availability;
    private String riskComments;

    public long getConfidentiality() { return confidentiality; }
    public void setConfidentiality(long value) { this.confidentiality = value; }

    public long getIntegrity() { return integrity; }
    public void setIntegrity(long value) { this.integrity = value; }

    public long getAvailability() { return availability; }
    public void setAvailability(long value) { this.availability = value; }

    public String getRiskComments() { return riskComments; }
    public void setRiskComments(String value) { this.riskComments = value; }
}
