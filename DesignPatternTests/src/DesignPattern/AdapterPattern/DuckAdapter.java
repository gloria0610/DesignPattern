package DesignPattern.AdapterPattern;

/**
 * Created by jiangyayi on 19/6/14.
 */
public class DuckAdapter implements Turky {
    Duck duck;

    public DuckAdapter(Duck duck){
        this.duck=duck;
    }

    @Override
    public void fly() {
        duck.fly();
    }

    @Override
    public void gobble() {
        duck.quack();
    }
}
