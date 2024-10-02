package org.event_driven.assignment02;


import org.event_driven.assignment02.controller.TrainController;
import org.event_driven.assignment02.service.TrainService;
import org.event_driven.assignment02.serviceImpl.TrainServiceImpl;

public class Application {

    public static void main(String[] args) {
        System.out.println("Application => {} :Train InterLocking System v-0.0.1");

        TrainService trainService = new TrainServiceImpl();

        TrainController controller = new TrainController(trainService);
        controller.addTrain("Train A", 1, 3);

//        System.out.println("Train A is currently at track section: " + controller.getTrain("Train A"));


    }
}
