package DesignPattern.SingletonPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton getInstance(){  //线程同步锁，会在每次get时被调用，影响性能
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }


    //直接new 饿汉式

//    private static Singleton singleton=new Singleton();
//    private Singleton(){}
//    public static  Singleton getInstance(){  //直接new的方式不需要判断，但是会创建可能没有被利用的实例
//        return singleton;
//    }

}
