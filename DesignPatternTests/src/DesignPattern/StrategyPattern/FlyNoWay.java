package DesignPattern.StrategyPattern;

/**
 * Created by jiangyayi on 19/6/10.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
