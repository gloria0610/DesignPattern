package DesignPattern.CompoundPattern.Factory;

import DesignPattern.CompoundPattern.DuckCall;
import DesignPattern.CompoundPattern.MallardDuck;
import DesignPattern.CompoundPattern.Quackable;
import DesignPattern.CompoundPattern.RedHeadDuck;

/**
 * Created by jiangyayi on 19/6/19.
 */

//鸭子原始工厂，创建没有装饰者的鸭子

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable creatDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable creatMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable creatRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable creatRubberDuck() {
        return new RedHeadDuck();
    }
}
