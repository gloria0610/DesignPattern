package DesignPattern.FactoryPattern;

/**
 * Created by jiangyayi on 19/6/12.
 */
public class PizzaCustermer {
    public static  void  main(String args[]){
        PizzaStore nyPizzaStore=new NYPizzaStore();
        System.out.println(nyPizzaStore.orderPizza("cheese").getAll());


    }
}
