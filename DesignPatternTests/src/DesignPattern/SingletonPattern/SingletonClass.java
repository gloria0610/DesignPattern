package DesignPattern.SingletonPattern;

/**
 * Created by jiangyayi on 19/5/29.
 */
//静态内部类方法,线程安全,延迟加载,效率高
public class SingletonClass {

    private SingletonClass(){}

    private static class SingletonInstance{
        private static final SingletonClass INSTANCE=new SingletonClass();

    }
    public static SingletonClass getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
