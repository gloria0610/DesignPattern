package DesignPattern.SingletonPattern;

/**
 * Created by jiangyayi on 19/5/29.
 */
public class SingletonLazySync {//懒汉式线程安全同步方法

    private static SingletonLazySync singletonLazySync;
    private SingletonLazySync(){}

    //此处如果不加synchronized则为线程不安全的懒汉式写法，不可用
    //增加同步方法对getInstance()进行线程同步，为可用方法但效率太低了

    public static synchronized SingletonLazySync getSingletonLazySync(){
        if (singletonLazySync==null){
            singletonLazySync=new SingletonLazySync();
        }
        return singletonLazySync;
    }
}
