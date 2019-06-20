package DesignPattern.CompoundPattern.Factory.FlockComposite;

import DesignPattern.CompoundPattern.Factory.AbstractDuckFactory;
import DesignPattern.CompoundPattern.Factory.CountingDuckFactory;
import DesignPattern.CompoundPattern.Goose;
import DesignPattern.CompoundPattern.GooseAdapter;
import DesignPattern.CompoundPattern.QuackCounter;
import DesignPattern.CompoundPattern.Quackable;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class DuckFlockSimulator {

//组合模式，使用迭代器创建群组鸭子，并实现相对灵活的树型鸭子群组遍历

    public static void main(String args[]){

        //创建一个测试实例
        DuckFlockSimulator duckFactorySimulator=new DuckFlockSimulator();

        //创建一个鸭子群
        AbstractDuckFactory duckflockFactory = new CountingDuckFactory();

        //测试实例调用鸭子群组合的生产鸭子方式，同时传入特定的鸭子群，即组合群
        duckFactorySimulator.simulateFlock(duckflockFactory);

    }

    void simulateFlock(AbstractDuckFactory duckflockFactory){
        //使用群组创建鸭子，把鸭子群组传入
        Quackable mallardDuck = duckflockFactory.creatMallardDuck();
        Quackable  redheadDuck = duckflockFactory.creatRedHeadDuck();
        Quackable  duckCall = duckflockFactory.creatDuckCall();
        Quackable rubberDuck = duckflockFactory.creatRubberDuck();

        //使用鹅鸭适配器 生成具有quack方法的鹅
        Quackable gooseDuck= new GooseAdapter(new Goose());

        System.out.println("\n 鸭子群组合方法");

        //鸭子种类组，每种一个

        Flock flockDucks=new Flock();

        flockDucks.add(redheadDuck);
        flockDucks.add(mallardDuck);
        flockDucks.add(duckCall);
        flockDucks.add(rubberDuck);

        //一群绿头鸭...flockMallars是flockDucks子节点，它有叶子节点
        Flock flockMallars=new Flock();

        //绿头鸭群组的叶子节点们
        Quackable mallardDuck1 = duckflockFactory.creatMallardDuck();
        Quackable mallardDuck2 = duckflockFactory.creatMallardDuck();
        Quackable mallardDuck3 = duckflockFactory.creatMallardDuck();
        Quackable mallardDuck4 = duckflockFactory.creatMallardDuck();

        //添加到绿头鸭父群组
        flockMallars.add(mallardDuck1);
        flockMallars.add(mallardDuck2);
        flockMallars.add(mallardDuck3);
        flockMallars.add(mallardDuck4);

        //添加至树形结构，他是个集合，不会叫，但有会叫的子节点。
        flockDucks.add(flockMallars);

        //分别测试
        System.out.println("我有一群鸭子在叫");
        simulate(flockDucks);


        System.out.println("绿头鸭子们在叫");
        simulate(flockMallars);

        System.out.println("一群鸭子一共叫了"+QuackCounter.getNumberofQuacks()+"次");

    }

    void simulate(Quackable duck){
        duck.quack();
    }

}
