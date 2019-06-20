package DesignPattern.StatePattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class GumballMonitor {

    GumballMachine machine;

    public GumballMonitor(GumballMachine machine){
        this.machine=machine;
    }

    public void report(){
        System.out.println("GumballMathine" + machine.getLocation());
        System.out.println("count" + machine.getCount());
        System.out.println("State"+machine.getState());
    }


}
