package com.lld.desginpatterns.factory;

public class Circle implements  Shape{


    @Override
    public void computeArea() {
        System.out.println("Area of a circle");
    }

    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}
