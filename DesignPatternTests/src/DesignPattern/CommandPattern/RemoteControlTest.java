package DesignPattern.CommandPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class RemoteControlTest {
    public static void main(String[] args){


        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light();
        LightOnCommand lightOn=new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        //命令模式，只要接收者自己定义自己的处理方式，同时实现Command的execute()方法即可，
        //Controller负责统一调用execute()方法执行各自的操作，并不关心每个接收者进行哪些动作
        //命令模式统一定义Command的set方法和调用execute()的执行方法即可

        GrageDoor door=new GrageDoor();
        GrageDoorOpenCommand doorOpen=new GrageDoorOpenCommand(door);

        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
    }
}
