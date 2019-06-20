package DesignPattern.DecoratorPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class StarbucksCoffee {

    public static void main(String args[]){
        Beverage beverage=new Espresso();

        System.out.println(beverage.getDescirption() + "价格:$" + beverage.cost());

        Beverage beverage2=new HouseBlend();
        beverage2 =new Mocha(beverage2);
        beverage2 =new Mocha(beverage2);
        beverage2 =new Whip(beverage2);

        System.out.println(beverage2.getDescirption()+"价格：￥"+beverage2.cost());
    }

}
