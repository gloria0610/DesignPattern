package DesignPattern.IteratorPattern;

/**
 * Created by jiangyayi on 19/6/15.
 */
public class MenuItem {
    //菜单类

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem( String name,String description, boolean vegetarian, double price){
        this.name=name;
        this.description=description;
        this.vegetarian=vegetarian;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getDescription() {
        return description;
    }
}
