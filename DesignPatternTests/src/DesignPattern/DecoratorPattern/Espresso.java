package DesignPattern.DecoratorPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class Espresso extends Beverage {

    public Espresso(){
        descirption="Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
