package DesignPattern.StatePattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public interface State {
    
    public  void insertQuarter();
    public  void ejectQuarter();
    public  void turnCrank();
    public  void dispense();

}
