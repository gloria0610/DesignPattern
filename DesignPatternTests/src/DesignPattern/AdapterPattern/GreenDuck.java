package DesignPattern.AdapterPattern;

/**
 * Created by jiangyayi on 19/6/14.
 */
public class GreenDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("i'm flying");
    }

    @Override
    public void quack() {
        System.out.println("guaguagua");
    }
}
