package DesignPattern.CompoundPattern.DuckObserver;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class DuckObserverSimulator {
    public static void main(String args[]){

        //创建一个测试实例
        DuckObserverSimulator duckObserverSimulator=new DuckObserverSimulator();

        //创建一个鸭子群
        CountingDuckFactory3x duckObserverFactory = new CountingDuckFactory3x();

        //测试实例调用鸭子群组合的生产鸭子方式，同时传入特定的鸭子群，即组合群
        duckObserverSimulator.simulateObserver(duckObserverFactory);

    }

    void simulateObserver(CountingDuckFactory3x duckObserverFactory){
        //使用群组创建鸭子，把鸭子群组传入
        Quackable3x mallardDuck3x = new QuackCounter3x(new MallardDuck3x());

        Flock3x flockDucks=new Flock3x();

        flockDucks.add(mallardDuck3x);

        //一群绿头鸭...flockMallars是flockDucks子节点，它有叶子节点
        Flock3x flockMallars=new Flock3x();

        //绿头鸭群组的叶子节点们
        Quackable3x mallardDuck1 = duckObserverFactory.creatMallardDuck3x();
        Quackable3x mallardDuck2 = duckObserverFactory.creatMallardDuck3x();
        Quackable3x mallardDuck3 = duckObserverFactory.creatMallardDuck3x();
        Quackable3x mallardDuck4 = duckObserverFactory.creatMallardDuck3x();

        //添加到绿头鸭父群组
        flockMallars.add(mallardDuck1);
        flockMallars.add(mallardDuck2);
        flockMallars.add(mallardDuck3);
        flockMallars.add(mallardDuck4);

        //添加至树形结构，他是个集合，不会叫，但有会叫的子节点。
        flockDucks.add(flockMallars);

        System.out.println("观察者在这里");

        Quackologist quackologist=new Quackologist();
        flockDucks.registerObserver(quackologist);

        simulate(flockDucks);
        System.out.println("一群鸭子一共叫了"+ QuackCounter3x.getNumberofQuacks()+"次");

    }

    void simulate(Quackable3x duck){
        duck.quack();
    }
}
