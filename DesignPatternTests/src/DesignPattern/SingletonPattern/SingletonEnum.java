package DesignPattern.SingletonPattern;

/**
 * Created by jiangyayi on 19/5/29.
 */
public enum SingletonEnum {

    INSTANCE;
    public void whateverMethod(){

    }

    public SingletonEnum getInstanse(){
        return INSTANCE;
    }
}
