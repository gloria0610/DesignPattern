package DesignPattern.CompoundPattern.Factory;

import DesignPattern.CompoundPattern.*;

/**
 * Created by jiangyayi on 19/6/19.
 */

//鸭子2级工厂，创建有计数装饰者的鸭子

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable creatRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable creatRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable creatMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable creatDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
