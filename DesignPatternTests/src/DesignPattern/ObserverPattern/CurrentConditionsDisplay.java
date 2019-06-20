package DesignPattern.ObserverPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float tempersture;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("温度更新:"+tempersture+"\n"+"湿度："+humidity);

    }

    @Override
    public void update(float temper, float humidity, float pressure) {
        this.humidity=humidity;
        this.tempersture=temper;
        display();
    }
}
