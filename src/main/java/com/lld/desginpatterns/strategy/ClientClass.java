package com.lld.desginpatterns.strategy;

public class ClientClass {

    public static void main(String[] args) {

        Vehicle vehicle = new SportsVehicle(new NormalDriveStrategy());
        vehicle.startDrive();
        Vehicle vehicle1 = new OffRoadVehicle(new SportyDriveStrategy());
        vehicle1.startDrive();
    }
}
