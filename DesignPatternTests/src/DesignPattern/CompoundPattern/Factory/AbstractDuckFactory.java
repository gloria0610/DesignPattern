package DesignPattern.CompoundPattern.Factory;

import DesignPattern.CompoundPattern.Quackable;

/**
 * Created by jiangyayi on 19/6/19.
 */
//鸭子抽象工厂，用于确保包装鸭子的抽象方法

public abstract class AbstractDuckFactory  {

    public abstract Quackable creatMallardDuck();
    public abstract Quackable creatRedHeadDuck();
    public abstract Quackable creatDuckCall();
    public abstract Quackable creatRubberDuck();
}
