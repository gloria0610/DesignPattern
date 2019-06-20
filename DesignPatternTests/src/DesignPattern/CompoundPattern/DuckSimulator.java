package DesignPattern.CompoundPattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class DuckSimulator {
//原始鸭子模拟器

    public static void main(String args[]){
        DuckSimulator duckSimulator=new DuckSimulator();
        duckSimulator.simulate();
    }

    void simulate(){
        //原始代码1.0，不含装饰者，只会叫
//        Quackable  mallardDuck = new MallardDuck();
//        Quackable  redheadDuck = new RedHeadDuck();
//        Quackable  duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
//        //使用鹅鸭适配器 生成具有quack方法的鹅
//        Quackable gooseDuck= new GooseAdapter(new Goose());

        //装饰者模式，给鸭子新的计数行为，包装鸭子的新属性？不必修改鸭子，但需要重新new一层
        Quackable  mallardDuck = new QuackCounter(new MallardDuck());
        Quackable  redheadDuck = new QuackCounter(new RedHeadDuck());
        Quackable  duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        //使用鹅鸭适配器 生成具有quack方法的鹅
        Quackable gooseDuck= new GooseAdapter(new Goose());


        //原始代码1.0
        // System.out.println("\n《Duck Simulator》鸭子模拟器");

        System.out.println("\n《Duck Simulator》鸭子模拟计数器:");
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
