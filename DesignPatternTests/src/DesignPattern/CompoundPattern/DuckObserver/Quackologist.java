package DesignPattern.CompoundPattern.DuckObserver;



/**
 * Created by jiangyayi on 19/6/19.
 */
public class Quackologist implements DuckObserver{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist"+duck+"叫了");
    }
}
