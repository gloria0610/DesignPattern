package DesignPattern.CompoundPattern.Factory;

import DesignPattern.CompoundPattern.*;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class DuckFactorySimulator {

    //工厂模式，使用鸭子工厂创建群子，并实现相对灵活的包装工厂调用

    public static void main(String args[]){

        //创建一个测试实例
        DuckFactorySimulator duckFactorySimulator=new DuckFactorySimulator();

        //创建一个鸭子工厂
        AbstractDuckFactory duckcountFactory = new CountingDuckFactory();

        //测试实例调用鸭子工厂的生产鸭子方式，同时传入特定的鸭子工厂，即count工厂
        duckFactorySimulator.simulateFactory(duckcountFactory);

    }

    void simulateFactory(AbstractDuckFactory duckcountFactory){
        //使用工厂创建鸭子，把工厂传入
        Quackable  mallardDuck = duckcountFactory.creatMallardDuck();
        Quackable  redheadDuck = duckcountFactory.creatRedHeadDuck();
        Quackable  duckCall = duckcountFactory.creatDuckCall();
        Quackable rubberDuck = duckcountFactory.creatRubberDuck();

        //使用鹅鸭适配器 生成具有quack方法的鹅
        Quackable gooseDuck= new GooseAdapter(new Goose());

        System.out.println("\n 鸭子工厂方法");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("鸭子叫了"+QuackCounter.getNumberofQuacks()+"次");

    }

    void simulate(Quackable duck){
        duck.quack();
    }

}
