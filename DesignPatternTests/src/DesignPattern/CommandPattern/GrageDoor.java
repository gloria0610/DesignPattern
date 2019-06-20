package DesignPattern.CommandPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class GrageDoor {

    Boolean doorstatus;

    public void open(){
        doorstatus=true;
    }

    public void close(){
        doorstatus=false;
    }
}

