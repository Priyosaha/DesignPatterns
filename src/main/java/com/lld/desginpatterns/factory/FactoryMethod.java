package com.lld.desginpatterns.factory;


public class FactoryMethod {


    public static Shape getInstance(ShapeType shapeType) {

        ShapeFactory shapeFactory;
        if(shapeType==ShapeType.SQUARE) {

            shapeFactory = new SquareFactory();

        } else if (shapeType == ShapeType.CIRCLE) {

            shapeFactory = new CircleFactory();

        }else{

            throw new IllegalArgumentException("This is not a valid shape type");
        }

        return shapeFactory.createShape();

    }
}
