package DesignPattern.CompoundPattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class DuckCall implements Quackable {
    //鸭鸣器

    @Override
    public void quack() {
        System.out.println("Kwak!");
    }
}
