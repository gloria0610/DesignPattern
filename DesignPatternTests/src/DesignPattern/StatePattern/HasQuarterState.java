package DesignPattern.StatePattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class HasQuarterState implements State{
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void dispense() {
        System.out.println("没东西给你");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退钱");
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }

    @Override
    public void insertQuarter() {
        System.out.println("you cant insert when it have money in there");
    }

    @Override
    public void turnCrank() {
        System.out.println("转动曲柄");
        gumballMachine.setState(gumballMachine.getSoldState());
    }


}
