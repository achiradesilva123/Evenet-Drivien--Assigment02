package org.event_driven.assignment02.dto;

public class Train {

    private String name;
    private int entryTrack;
    private int destination;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntryTrack() {
        return entryTrack;
    }

    public void setEntryTrack(int entryTrack) {
        this.entryTrack = entryTrack;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}
