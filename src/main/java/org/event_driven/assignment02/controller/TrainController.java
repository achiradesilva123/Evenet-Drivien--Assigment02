package org.event_driven.assignment02.controller;

import org.event_driven.assignment02.service.TrainService;

public class TrainController {

    private TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    public void addTrain(String trainName, int entryTrackSection, int destinationTrackSection){
        trainService.addTrain(trainName,entryTrackSection,destinationTrackSection);
    };
    public int moveTrains(String[] trainNames) {
        return trainService.moveTrains(trainNames);
    }
    public String getSection(int trackSection) {
        return trainService.getSection(trackSection);
    }
    public int getTrain(String trainName){
        return trainService.getTrain(trainName);
    };
}
