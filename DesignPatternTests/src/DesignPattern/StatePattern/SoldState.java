package DesignPattern.StatePattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("你等等，我们正在给你糖");
    }


    @Override
    public void ejectQuarter() {
        System.out.println("售出不退拜拜了您内");

    }


    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("哎呀糖卖完了，应该给你退钱");
            gumballMachine.hasQuarterState.ejectQuarter();
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }



    @Override
    public void turnCrank() {
        System.out.println("转两次也不会给你俩");

    }
}
