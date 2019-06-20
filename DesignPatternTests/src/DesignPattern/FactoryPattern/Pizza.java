package DesignPattern.FactoryPattern;

import java.util.ArrayList;

/**
 * Created by jiangyayi on 19/6/12.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings=new ArrayList();

    void doPizza() {
        System.out.println("preparing" + "、bake" + "、cut" + "、boxing");
    }

    public String getName() {
        return name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }

    public String getAll(){
        return name+dough+sauce+toppings.get(0);
    }
}
