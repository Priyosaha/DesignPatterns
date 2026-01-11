package com.lld.desginpatterns.factory;

public class Client {


    public static void main(String[] args) {

        Shape shape = FactoryMethod.getInstance(ShapeType.CIRCLE);
        shape.computeArea();
        shape.draw();
        shape = FactoryMethod.getInstance(ShapeType.SQUARE);
        shape.computeArea();
        shape.draw();

    }
}
