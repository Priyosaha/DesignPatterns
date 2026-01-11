package com.lld.desginpatterns.factory;

public class CircleFactory implements ShapeFactory {


    @Override
    public Shape createShape() {
        return new Circle();
    }
}
