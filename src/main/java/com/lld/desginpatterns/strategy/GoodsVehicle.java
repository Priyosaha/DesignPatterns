package com.lld.desginpatterns.strategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
        System.out.println("This is a GoodsVehicle");
    }
}
