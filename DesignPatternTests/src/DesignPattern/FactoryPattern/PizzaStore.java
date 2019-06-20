package DesignPattern.FactoryPattern;

/**
 * Created by jiangyayi on 19/6/12.
 */
public abstract class PizzaStore  {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=creatPizza(type);
        pizza.doPizza();
        System.out.println(pizza);
        return pizza;

    }

    abstract Pizza creatPizza(String type);

}

