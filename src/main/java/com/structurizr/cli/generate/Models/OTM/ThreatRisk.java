package com.structurizr.cli.generate.Models.OTM;

public class ThreatRisk {
    private long likelihood;
    private String likelihoodComment;
    private long impact;
    private String impactComment;

    public long getLikelihood() { return likelihood; }
    public void setLikelihood(long value) { this.likelihood = value; }

    public String getLikelihoodComment() { return likelihoodComment; }
    public void setLikelihoodComment(String value) { this.likelihoodComment = value; }

    public long getImpact() { return impact; }
    public void setImpact(long value) { this.impact = value; }

    public String getImpactComment() { return impactComment; }
    public void setImpactComment(String value) { this.impactComment = value; }
}
