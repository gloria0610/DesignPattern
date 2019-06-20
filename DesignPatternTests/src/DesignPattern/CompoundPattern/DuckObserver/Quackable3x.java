package DesignPattern.CompoundPattern.DuckObserver;

/**
 * Created by jiangyayi on 19/6/19.
 */

    public interface Quackable3x extends QuackObservable {
        //鸭叫接口1.0 只定义quack方法
        //3.0 增加观察者继承，意味着实现Quackable的类都必须实现观察者方法

        public void quack();
    }


