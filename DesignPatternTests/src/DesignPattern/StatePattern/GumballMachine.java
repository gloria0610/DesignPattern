package DesignPattern.StatePattern;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class GumballMachine {

    String location;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state=soldState;

    int count=0;

    public GumballMachine(int numberGumballs){
        soldOutState=new SoldOutState(this);
        noQuarterState=new NoQuarterState(this);
        hasQuarterState= new HasQuarterState(this);
        soldState =new SoldState(this);


        this.count=numberGumballs;

        if(numberGumballs>0){
            state=noQuarterState;
        }

    }

    public GumballMachine(String location,int count){
        this.location=location;
        this.count=count;
    }

    public String getLocation() {
        return location;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state=state;
    }

    void releaseBall(){
        System.out.println("A gumball come rolling out the slot");
        if(count!=0){
            count-=1;
        }
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }
}
