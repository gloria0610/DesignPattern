package DesignPattern.FactoryPattern;

import DesignPattern.FactoryPattern.Ingredinet.Dough;
import DesignPattern.FactoryPattern.Ingredinet.Sauce;

/**
 * Created by jiangyayi on 19/6/12.
 */
public interface PizzaIngredinetFactory {

    public Dough creatDough();
    public Sauce creatSauce();
}
