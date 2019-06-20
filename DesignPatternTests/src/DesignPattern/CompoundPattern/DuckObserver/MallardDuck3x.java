package DesignPattern.CompoundPattern.DuckObserver;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class MallardDuck3x implements Quackable3x {

    public Observable observable;

    public MallardDuck3x(){
       observable=new Observable(this);
    }

    @Override
    public void registerObserver(DuckObserver duckObserver) {
        observable.registerObserver(duckObserver);
    }

    @Override
    public void quack() {
        System.out.println("Quack3x");
        notifyObservers(); //这个notify没生效啊
       // System.out.println("我叫了");
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
