package DesignPattern.SingletonPattern;

/**
 * Created by jiangyayi on 19/5/29.
 */
public class SingletonDemo {

   private static SingletonDemo INSTANCE=new SingletonDemo();

   private  SingletonDemo(){}

    public static SingletonDemo getINSTANCE(){
        return INSTANCE;
    }
}
