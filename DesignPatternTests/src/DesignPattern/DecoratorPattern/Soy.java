package DesignPattern.DecoratorPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class Soy extends Condiment {
    Beverage beverage;

    public  Soy(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescirption() {
        return beverage.getDescirption()+"Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.3;
    }
}
