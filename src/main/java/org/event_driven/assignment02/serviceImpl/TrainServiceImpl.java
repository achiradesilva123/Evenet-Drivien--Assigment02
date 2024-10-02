package org.event_driven.assignment02.serviceImpl;

import org.event_driven.assignment02.dto.Train;
import org.event_driven.assignment02.service.TrainService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainServiceImpl implements TrainService {

    private Map<String, Train> trains;
    private Map<Integer, String> trackSections;

    public TrainServiceImpl() {
        trains = new HashMap<>();
        trackSections = new HashMap<>();
    }

    @Override
    public void addTrain(String trainName, int entryTrackSection, int destinationTrackSection) throws IllegalArgumentException, IllegalStateException {

        System.out.println("came here : "+ trainName);

        if (trains.containsKey(trainName)) {
            System.out.println("Train name already in use.");
        }
        if (trackSections.containsKey(entryTrackSection)) {
            System.out.println("Track is already occupied");
        }
        trains.put(trainName, new Train(trainName, entryTrackSection, destinationTrackSection));
        trackSections.put(entryTrackSection, trainName);

    }

    @Override
    public int moveTrains(String[] trainNames) throws IllegalArgumentException {
        int movedCount = 0;
        for (String trainName : trainNames) {
            Train train = trains.get(trainName);
            if (train != null) {
                int currentSection = train.getEntryTrack();
                if (trackSections.containsKey(currentSection)) {

                    if (currentSection == train.getDestination()) {
                        trackSections.remove(currentSection);
                        trains.remove(trainName);
                    } else {
                        int nextSection = currentSection + 1;
                        train.setEntryTrack(nextSection);
                        trackSections.put(nextSection, trainName);
                        movedCount++;
                    }
                }
            }
        }
        return movedCount;
    }

    @Override
    public String getSection(int trackSection) throws IllegalArgumentException {
        return trackSections.get(trackSection);
    }

    @Override
    public int getTrain(String trainName) throws IllegalArgumentException {
        Train train = trains.get(trainName);
        return train != null ? train.getEntryTrack() : -1;
    }
}
