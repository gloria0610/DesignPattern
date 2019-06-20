package DesignPattern.DecoratorPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class Whip extends Condiment {

    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescirption() {
        return beverage.getDescirption()+"Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}
