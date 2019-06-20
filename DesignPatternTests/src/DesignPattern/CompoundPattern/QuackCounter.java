package DesignPattern.CompoundPattern;

/**
 * Created by jiangyayi on 19/6/19.
 */

//装饰者对象，给鸭子一些新行为，计算次数。不必修改鸭子

public class QuackCounter implements Quackable{

    Quackable duck;
    static int numberofQuacks;


    public QuackCounter(Quackable duck){
        this.duck=duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberofQuacks++;

    }

    public static int getNumberofQuacks() {
        return numberofQuacks;
    }

//    @Override
//    public void notifyObservers() {
//        observable.notifyObservers();
//    }
//
//    @Override
//    public void registerObserver(DuckObserver duckObserver) {
//        observable.registerObserver(duckObserver);
//
//    }
}
