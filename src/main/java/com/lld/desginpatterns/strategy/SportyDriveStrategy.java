package com.lld.desginpatterns.strategy;

public class SportyDriveStrategy implements DriveStrategy{

    @Override
    public void drive(String name) {
        System.out.println("This is car is using the strategy --> " + name);
    }
}
