package DesignPattern.CommandPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class GrageDoorOpenCommand implements Command {

    //只要接收者自己定义自己的处理方式，同时实现Command的execute()方法即可，
    //设计模式负责统一调用execute()方法执行各自的操作，并不关心每个接收者进行哪些动作

    GrageDoor door;

    public GrageDoorOpenCommand(GrageDoor door){
        this.door=door;
    }
    @Override
    public void execute() {
        door.open();
        System.out.println("door is open");
    }
}
