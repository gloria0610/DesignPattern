package DesignPattern.AdapterPattern;

/**
 * Created by jiangyayi on 19/6/14.
 */
public class TurkeyAdapter implements Duck {

    Turky turky;

    public TurkeyAdapter(Turky turky){
        this.turky=turky;
    }
    @Override
    public void quack() {
        turky.gobble();
    }

    @Override
    public void fly() {
        for (int i=0;i<5;i++){
        turky.fly();
        }
    }
}
