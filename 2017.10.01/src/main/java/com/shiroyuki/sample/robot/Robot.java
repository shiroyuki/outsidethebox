package com.shiroyuki.sample.robot;

public class Robot {
    private MotionController motionController;

    public Robot(MotionController motionController) {
        this.motionController = motionController;
    }

    public void goForward() {
        this.motionController.advance();
    }

    public void goBackward() {
        this.motionController.reverse();
    }

    public void turnLeft() {
        this.motionController.turnLeft();
    }

    public void turnRight() {
        this.motionController.turnRight();
    }
}
