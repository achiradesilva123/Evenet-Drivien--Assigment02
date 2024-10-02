package org.event_driven.assignment02.serviceImpl;

import org.event_driven.assignment02.service.Interlocking;

public class InterLockingServiceImpl implements Interlocking {
    @Override
    public void addTrain(String trainName, int entryTrackSection, int destinationTrackSection) throws IllegalArgumentException, IllegalStateException {

    }

    @Override
    public int moveTrains(String[] trainNames) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public String getSection(int trackSection) throws IllegalArgumentException {
        return null;
    }

    @Override
    public int getTrain(String trainName) throws IllegalArgumentException {
        return 0;
    }
}
