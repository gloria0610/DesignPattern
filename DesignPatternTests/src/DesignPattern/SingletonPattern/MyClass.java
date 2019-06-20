package DesignPattern.SingletonPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class MyClass {

    private MyClass(){}

    public static   MyClass getInstance(){
       return new MyClass();
    }
}
