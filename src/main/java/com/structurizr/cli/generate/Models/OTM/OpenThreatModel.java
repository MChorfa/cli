package com.structurizr.cli.generate.Models.OTM;

public class OpenThreatModel {

    private String otmVersion;
    private Project project;
    private Representation[] representations;
    private Asset[] assets;
    private Component[] components;
    private Dataflow[] dataflows;
    private TrustZone[] trustZones;
    private Threat[] threats;
    private Asset[] mitigations;

    public String getOtmVersion() { return otmVersion; }
    public void setOtmVersion(String value) { this.otmVersion = value; }

    public Project getProject() { return project; }
    public void setProject(Project value) { this.project = value; }

    public Representation[] getRepresentations() { return representations; }
    public void setRepresentations(Representation[] value) { this.representations = value; }

    public Asset[] getAssets() { return assets; }
    public void setAssets(Asset[] value) { this.assets = value; }

    public Component[] getComponents() { return components; }
    public void setComponents(Component[] value) { this.components = value; }

    public Dataflow[] getDataflows() { return dataflows; }
    public void setDataflows(Dataflow[] value) { this.dataflows = value; }

    public TrustZone[] getTrustZones() { return trustZones; }
    public void setTrustZones(TrustZone[] value) { this.trustZones = value; }

    public Threat[] getThreats() { return threats; }
    public void setThreats(Threat[] value) { this.threats = value; }

    public Asset[] getMitigations() { return mitigations; }
    public void setMitigations(Asset[] value) { this.mitigations = value; }
}
