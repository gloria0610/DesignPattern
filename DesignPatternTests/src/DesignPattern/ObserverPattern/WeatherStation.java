package DesignPattern.ObserverPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class WeatherStation {
    public static void main(String args[]){
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(70,50,20.8f);
        weatherData.setMeasurements(60,40,10.2f);
    }
}
