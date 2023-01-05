package com.structurizr.cli.generate.Models.OTM;

import java.util.UUID;

public class ComponentThreat {
    private UUID threat;
    private String state;
    private Mitigation[] mitigations;

    public UUID getThreat() { return threat; }
    public void setThreat(UUID value) { this.threat = value; }

    public String getState() { return state; }
    public void setState(String value) { this.state = value; }

    public Mitigation[] getMitigations() { return mitigations; }
    public void setMitigations(Mitigation[] value) { this.mitigations = value; }
}
