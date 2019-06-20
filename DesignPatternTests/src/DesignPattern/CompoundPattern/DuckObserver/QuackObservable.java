package DesignPattern.CompoundPattern.DuckObserver;


/**
 * Created by jiangyayi on 19/6/19.
 */
public interface QuackObservable {
    //观察者接口，定义观察者规范方法

    public void registerObserver(DuckObserver duckObserver);

    public void notifyObservers();
}

//
//public interface Quackable extends QuackObservable{
//    //鸭叫接口1.0 只定义quack方法
//    //3.0 增加观察者继承，意味着实现Quackable的类都必须实现观察者方法
//    //但改动太大，所以我们应封装注册通知的代码，然后组合QuackObservable即可。
//    public void quack();
//}
