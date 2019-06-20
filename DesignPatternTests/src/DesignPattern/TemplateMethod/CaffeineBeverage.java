package DesignPattern.TemplateMethod;

/**
 * Created by jiangyayi on 19/6/14.
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourlnCup();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("Make water hoooooot");
    }

    public void pourlnCup(){
        System.out.println("Make the cup full");
    }

}
