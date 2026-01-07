package com.lld.desginpatterns.observerpush;

public class TemperatureObserver implements WeatherObserver{

    @Override
    public void update(ObservableData observableData) {
        System.out.println("In TemperatureObserver display");
        System.out.println(observableData.getCondition() + " " +observableData.getTemp());

    }
}
