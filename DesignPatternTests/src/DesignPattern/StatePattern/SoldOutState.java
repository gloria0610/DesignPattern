package DesignPattern.StatePattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject,there is no money in me");
    }

    @Override
    public void insertQuarter() {
        System.out.println("im empty, keep your money");

    }

    @Override
    public void turnCrank() {
        System.out.println("why are you do this? there is no candy!");
    }
}
