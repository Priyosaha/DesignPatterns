package com.lld.desginpatterns.observerpush;

public class ClientClass {

    public static void main(String[] args) throws Exception {

        WeatherObservable weatherObservable = new WeatherStation();

        WeatherObserver weatherObserverForecast = new ForeCastObserver();
        WeatherObserver weatherObserverCondition = new TemperatureObserver();

        weatherObservable.add(weatherObserverCondition);
        weatherObservable.add(weatherObserverForecast);
        weatherObservable.setWeatherData(45,"hot");
        weatherObservable.remove(weatherObserverCondition);
        weatherObservable.setWeatherData(4,"cold");
        weatherObservable.remove(weatherObserverForecast);
        weatherObservable.setWeatherData(24,"pleasant");

    }
}
