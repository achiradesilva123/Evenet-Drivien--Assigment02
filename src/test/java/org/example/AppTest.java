package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.event_driven.assignment02.service.TrainService;
import org.event_driven.assignment02.serviceImpl.TrainServiceImpl;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testAddTrain() {
        TrainService trainService = new TrainServiceImpl();
        trainService.addTrain("Train A", 1, 3);
        assertEquals(1, trainService.getTrain("Train A"));
    }

    public void testMoveTrain() {
        TrainService trainService = new TrainServiceImpl();
        trainService.addTrain("Train A", 1, 3);
        trainService.moveTrains(new String[]{"Train A"});
        assertEquals(2, trainService.getTrain("Train A"));
    }
}
