package org.event_driven.assignment02;


import org.event_driven.assignment02.controller.TrainController;
import org.event_driven.assignment02.service.TrainService;
import org.event_driven.assignment02.serviceImpl.TrainServiceImpl;

public class Application {

    public static void main(String[] args) {
        System.out.println("Application => {} :Train InterLocking System v-0.0.1");

        TrainService trainService = new TrainServiceImpl();

        TrainController trainController = new TrainController(trainService);
        trainController.addTrain("Train A", 1, 3);
        trainController.addTrain("Train B", 2, 4);
        trainController.moveTrains(new String[]{"Train A", "Train B"});

        System.out.println("Train A is currently at track section: " + trainController.getTrain("Train A"));
        System.out.println("Train B is currently at track section: " + trainController.getTrain("Train B"));


    }
}
