package DesignPattern.TemplateMethod;

/**
 * Created by jiangyayi on 19/6/14.
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void addCondiments() {
        System.out.println("Add ice and lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping tea");
    }
}
