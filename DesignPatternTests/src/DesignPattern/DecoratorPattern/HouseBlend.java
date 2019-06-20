package DesignPattern.DecoratorPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        descirption="HouseBlend";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
