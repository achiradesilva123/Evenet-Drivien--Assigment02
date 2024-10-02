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
    public void moveTrain(){};
    public int getTrain(String trainName){
        return trainService.getTrain(trainName);
    };
}
