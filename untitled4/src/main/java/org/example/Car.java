package org.example;

public class Car {
    private String make;
    private String model;
    private int year;
    private boolean running;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.running = false;
    }

    public void start() {
        running = true;
    }

    public void stop() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public String getMakeAndModel() {
        return make + " " + model;
    }
}
