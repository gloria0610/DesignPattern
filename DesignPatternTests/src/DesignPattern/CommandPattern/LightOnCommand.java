package DesignPattern.CommandPattern;

/**
 * Created by jiangyayi on 19/6/13.
 */
public class LightOnCommand implements Command {

     Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
        System.out.println("light is on");
    }
}
