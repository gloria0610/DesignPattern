package DesignPattern.FactoryPattern;

/**
 * Created by jiangyayi on 19/6/12.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name="NY Style Cheese Pizza";
        dough="thin";
        sauce="marinara sauce";
        toppings.add("shredded mozzarella cheese");
    }

    public NYStyleCheesePizza(String nyname,String dough,String sauce){
        this.name=nyname;
        this.dough=dough;
        this.sauce=sauce;
        toppings.add("shredded mozzarella cheese");
    }
}
