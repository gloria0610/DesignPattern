package DesignPattern.StrategyPattern;

/**
 * Created by jiangyayi on 19/6/10.
 */
public class ModelDuck extends TheDuck {

    public ModelDuck(){
        flyBehavior =new FlyNoWay();
        quackBehavior=new Quack();

    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
