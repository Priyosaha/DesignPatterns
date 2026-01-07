package com.lld.desginpatterns.observerpush;

public interface WeatherObservable {

    void add (WeatherObserver observer);
    void remove(WeatherObserver observer);
    void setWeatherData(int temp, String condition) throws Exception;
}
