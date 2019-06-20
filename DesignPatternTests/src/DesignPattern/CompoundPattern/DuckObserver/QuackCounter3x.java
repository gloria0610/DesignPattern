package DesignPattern.CompoundPattern.DuckObserver;

/**
 * Created by jiangyayi on 19/6/19.
 */

//装饰者对象，给鸭子一些新行为，计算次数。不必修改鸭子

public class QuackCounter3x implements Quackable3x{

    Quackable3x duck;
    static int numberofQuacks3x;
    Observable observable;

    //在构造器中，我们创建一个observable并传入一个对象的引用。


    public QuackCounter3x(Quackable3x duck){
        this.duck=duck;
        observable=new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberofQuacks3x++;


    }

    public static int getNumberofQuacks() {
        return numberofQuacks3x;
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void registerObserver(DuckObserver duckObserver) {
//        observable.registerObserver(duckObserver);
        duck.registerObserver(duckObserver);
    }
}
