package DesignPattern.TemplateMethod;

/**
 * Created by jiangyayi on 19/6/14.
 */
public class Caffee extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Add suger and milk");
    }

    @Override
    public void brew() {
        System.out.println("Make a coffee");
    }
}
