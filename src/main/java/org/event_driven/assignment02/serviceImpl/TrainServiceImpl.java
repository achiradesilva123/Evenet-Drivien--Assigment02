package org.event_driven.assignment02.serviceImpl;

import org.event_driven.assignment02.dto.Train;
import org.event_driven.assignment02.service.TrainService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrainServiceImpl implements TrainService {

    private List<String> trains;
    private List<String> trackSections;

    public TrainServiceImpl() {
        this.trains = new ArrayList<>();
        this.trackSections =new ArrayList<>();
    }

    @Override
    public void addTrain(String trainName, int entryTrackSection, int destinationTrackSection) throws IllegalArgumentException, IllegalStateException {

        System.out.println("came here : "+ trainName);

//        if (trains.contains(trainName)) {
//            System.out.println("Train name already in use.");
//        }
//        if (trackSections.contains(entryTrackSection)) {
//            System.out.println("Track is occupied");
//        }
        trains.add(trainName);

    }

    @Override
    public int moveTrains(String[] trainNames) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public String getSection(int trackSection) throws IllegalArgumentException {
        return trackSections.get(trackSection);
    }

    @Override
    public int getTrain(String trainName) throws IllegalArgumentException {
      return trains.indexOf(trainName);
    }
}
