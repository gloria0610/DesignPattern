package DesignPattern.ObserverPattern;

import java.util.ArrayList;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList();
    }

    @Override
    public void registerObserver(Object o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Object o) {
        int i=observers.indexOf(o);
        if (i>=0){
            observers.remove(o);
        }
    }


    @Override
    public void notifyObserver() {
        for (int i=0;i<observers.size();i++){
            Observer observer=(Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }

    }
    public void measurementsChanged(){
        this.notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemperature(float temper){
        this.temperature=temper;
        return temperature;
    }

    public float getHumidity(float humi){
        this.humidity=humi;
        return humidity;
    }

    public float getPressure(float pres){
        this.pressure=pres;
        return pressure;
    }


}
