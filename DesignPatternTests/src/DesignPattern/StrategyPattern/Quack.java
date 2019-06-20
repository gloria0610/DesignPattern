package DesignPattern.StrategyPattern;

/**
 * Created by jiangyayi on 19/6/10.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
