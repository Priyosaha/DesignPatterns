package com.lld.desginpatterns.strategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
        System.out.println("This is a off road Vehicle");
    }
}
