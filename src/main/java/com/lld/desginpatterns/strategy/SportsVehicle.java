package com.lld.desginpatterns.strategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
        System.out.println("This is a Sports Vehicle");
    }
}
