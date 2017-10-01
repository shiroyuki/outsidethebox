package com.shiroyuki.sample.robot;

import static org.mockito.Mockito.*;
import org.junit.Test;

import com.shiroyuki.sample.robot.MotionController;
import com.shiroyuki.sample.robot.Robot;

public class RobotTests {
    @Test
    public void robotGoForward() {
        // Setup
        MotionController motionControllerMock = mock(MotionController.class);

        // Simulation
        Robot robot = new Robot(motionControllerMock);
        robot.goForward();

        // Assertions
        verify(motionControllerMock, times(1)).advance();
    }
}
