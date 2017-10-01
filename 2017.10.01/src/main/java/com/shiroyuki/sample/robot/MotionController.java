package com.shiroyuki.sample.robot;

import java.io.PrintStream;

public class MotionController {
    private PrintStream outputStream;

    public MotionController(PrintStream outputStream) {
        this.outputStream = outputStream;
    }

    public void advance() {
        this.outputStream.println("advance");
    }

    public void reverse() {
        this.outputStream.println("reverse");
    }

    public void turnLeft() {
        this.outputStream.println("turnLeft");
    }

    public void turnRight() {
        this.outputStream.println("turnRight");
    }
}
