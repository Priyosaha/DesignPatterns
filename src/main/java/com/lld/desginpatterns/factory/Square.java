package com.lld.desginpatterns.factory;

public class Square implements Shape{

    @Override
    public void computeArea() {
        System.out.println("Area of a square");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
