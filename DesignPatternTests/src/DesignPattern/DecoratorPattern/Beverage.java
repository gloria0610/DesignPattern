package DesignPattern.DecoratorPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public abstract class Beverage {
    String descirption="Unkown Beverage";

    public String getDescirption(){
        return descirption;
    }

    public abstract double cost();

}
