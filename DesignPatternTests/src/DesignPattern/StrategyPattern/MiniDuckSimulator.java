package DesignPattern.StrategyPattern;

/**
 * Created by jiangyayi on 19/6/10.
 */
public class MiniDuckSimulator {
    public static  void main(String args[]){

        TheDuck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
