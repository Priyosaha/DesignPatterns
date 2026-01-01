package com.lld.desginpatterns.strategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void startDrive() {

        if(driveStrategy instanceof EVDriveStrategy) {

            driveStrategy.drive("EVDriveStrategy");
        }else if (driveStrategy instanceof NormalDriveStrategy) {
            driveStrategy.drive("NormalDriveStrategy");
        }else if(driveStrategy instanceof SportyDriveStrategy) {
            driveStrategy.drive("SportyDriveStrategy");
        }
    }
}
