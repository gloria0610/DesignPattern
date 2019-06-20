package DesignPattern.StatePattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void dispense() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void turnCrank() {

    }
}
