package DesignPattern.CompositePattern;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jiangyayi on 19/6/18.
 */
public class Menu extends MenuComponent {

    ArrayList menuComponents=new ArrayList();
    //ArrayList<MenuComponent> menuComponents=new ArrayList();

    String name;
    String description;

    public Menu(String name,String description){
        this.name=name;
        this.description=description;
    }

    public void  add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void  remove(MenuComponent menuComponent){
       menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
       return (MenuComponent)menuComponents.get(i);  //???为什么要加括号呢
    }
    public String getName(){
        return  name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.println(" " + getName());
        System.out.println(","+getDescription());
        System.out.println("-------------------------------");

        //此处需要组合节点来修正print，不只打印他自身，还包括其叶子节点和下层节点。所以我们使用递归

        Iterator iterator=menuComponents.iterator();

        while (iterator.hasNext()){

            MenuComponent menuComponent=(MenuComponent)iterator.next();
            menuComponent.print();
        }
    }




}
