package com.lld.desginpatterns.observerpush;

public class ObservableData {

    private int temp;
    private  String condition;

    public void setTemp(int temp) {
        this.temp = temp;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public int getTemp() {
        return this.temp;
    }

    public String getCondition() {
        return this.condition;
    }
}
