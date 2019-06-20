package DesignPattern.CompoundPattern.DuckObserver;

/**
 * Created by jiangyayi on 19/6/19.
 */

//鸭子2级工厂，创建有计数装饰者的鸭子

public class CountingDuckFactory3x {

    public Quackable3x creatMallardDuck3x() {
        return new QuackCounter3x(new MallardDuck3x());
    }



}
