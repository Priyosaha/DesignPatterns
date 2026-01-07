package com.lld.desginpatterns.observerpush;

public class ForeCastObserver implements WeatherObserver{

    @Override
    public void update(ObservableData observableData) {
        System.out.println("In Forecast display");
        System.out.println(observableData.getCondition() + " " +observableData.getTemp());
    }
}
