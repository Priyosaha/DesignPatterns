package com.lld.desginpatterns.observerpush;

import com.lld.desginpatterns.observerpush.exceptions.NoObjectException;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {

    ObservableData observableData;
    List<WeatherObserver> weatherObserverList;

    public WeatherStation() {
        this.weatherObserverList = new ArrayList<>();
    }

    @Override
    public void add(WeatherObserver observer) {

        weatherObserverList.add(observer);

    }

    @Override
    public void remove(WeatherObserver observer) {

        weatherObserverList.remove(observer);
    }

    public  void  sendNotification(ObservableData observableData) throws Exception {

        if(weatherObserverList.isEmpty()) {
            throw new NoObjectException("no observers inside the list, add observers first");
        }
        for(WeatherObserver observers : weatherObserverList ) {
            observers.update(observableData);
        }
    }
    @Override
    public void setWeatherData(int temp, String condition) throws Exception {

        observableData = new ObservableData();
        observableData.setTemp(temp);
        observableData.setCondition(condition);
        this.sendNotification(observableData);
    }

}
