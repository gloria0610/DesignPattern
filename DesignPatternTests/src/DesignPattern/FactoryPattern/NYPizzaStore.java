package DesignPattern.FactoryPattern;

/**
 * Created by jiangyayi on 19/6/12.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza creatPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        return null;
    }

}

//问题：对于抽象类的实现，如果父类有实现了应该不需要覆盖了吧。
//如果父类声明了字段但是没赋值，子类是一定要赋值的吗？