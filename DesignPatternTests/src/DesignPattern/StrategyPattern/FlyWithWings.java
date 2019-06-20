package DesignPattern.StrategyPattern;

/**
 * Created by jiangyayi on 19/6/10.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
