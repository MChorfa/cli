package com.structurizr.cli.generate.Models.OTM;

public class TrustZoneRepresentation {
    private String representation;
    private String id;
    private Position position;
    private Size size;

    public String getRepresentation() { return representation; }
    public void setRepresentation(String value) { this.representation = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public Position getPosition() { return position; }
    public void setPosition(Position value) { this.position = value; }

    public Size getSize() { return size; }
    public void setSize(Size value) { this.size = value; }
}
