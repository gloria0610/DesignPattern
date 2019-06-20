package DesignPattern.DecoratorPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class Mocha extends Condiment {

    Beverage beverage;

    public  Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescirption() {
        return beverage.getDescirption()+"mocha";
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}
