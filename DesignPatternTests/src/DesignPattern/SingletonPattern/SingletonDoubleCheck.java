package DesignPattern.SingletonPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class SingletonDoubleCheck {

    private volatile  static  SingletonDoubleCheck singletonInstance;

    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getInstance(){
        if (singletonInstance==null){ //检查实例，如果不存在，进入同步区块。只有第一次创建会走到这个逻辑
            synchronized (SingletonDoubleCheck.class){
                if(singletonInstance==null){ //进入区块后，再检查一次，由于前面已经同步过了，如果仍是null，才创建。
                   singletonInstance= new SingletonDoubleCheck();
                }
            }
        }
        return singletonInstance;
    }

}
