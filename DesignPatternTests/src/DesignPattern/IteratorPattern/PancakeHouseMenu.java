package DesignPattern.IteratorPattern;


import java.util.ArrayList;

/**
 * Created by jiangyayi on 19/6/15.
 */
public class PancakeHouseMenu  {

    ArrayList menuItems;

    public PancakeHouseMenu(){

        menuItems=new ArrayList();
        addItem("KB'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("KB'S Pancake Breakfast1","Pancakes with scrambled eggs,frice,and toast",true,2.99);
        addItem("KB'S Pancake Breakfast2","Pancakes with scrambled eggs,tomato,and toast",true,3.99);
        addItem("KB'S Pancake Breakfast3","Pancakes with scrambled eggs,beef,and toast",true,4.99);

    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator creatIterator(){

        return new PancakeHouseMenuIterator(menuItems);
        //return menuItems.iterator();//使用java的默认方法
    }
}
