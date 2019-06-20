package DesignPattern.CommandPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class Light {

    String name;
    Boolean status;
    
    public void on(){
        status=true;
    }

    public void off(){
        status=false;
    }
}
