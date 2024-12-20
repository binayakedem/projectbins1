package com.interface_example.question_3;

public class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("start the car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the car");
    }
}

class Bike implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Start the bike");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the bike");
    }
}