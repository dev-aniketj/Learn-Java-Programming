package com.aniket.java.solid;

/**
 * L - Liskov Substitution Principle
 */

class Vehicle {
    public void start() {
        System.out.println("starting a vehicle");
    }

    public void stop() {
        System.out.println("stopping a vehicle");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("starting a bike");
    }

    @Override
    public void stop() {
        System.out.println("stopping a bike");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        //System.out.println("starting a car");
        throw new RuntimeException("boom you are gone..");
    }

    @Override
    public void stop() {
        System.out.println("stopping a car");
    }
}

public class SolidEx3 {

    static void testDrive(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }

    public static void main(String[] args) {
        testDrive(new Vehicle());

        System.out.println();
        testDrive(new Bike());

        System.out.println();
        testDrive(new Car());
    }
}
