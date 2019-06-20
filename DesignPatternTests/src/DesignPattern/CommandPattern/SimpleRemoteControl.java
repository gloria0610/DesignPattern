package DesignPattern.CommandPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class SimpleRemoteControl {

    //只要接收者自己定义自己的处理方式，同时实现Command的execute()方法即可，
    //设计模式负责统一调用execute()方法执行各自的操作，并不关心每个接收者进行哪些动作
    //命令模式统一定义Command的set方法和调用execute()的执行方法即可

    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
