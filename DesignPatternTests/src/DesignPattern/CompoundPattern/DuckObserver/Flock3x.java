package DesignPattern.CompoundPattern.DuckObserver;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class Flock3x  implements Quackable3x {

    ArrayList ducks=new ArrayList();

    public void add(Quackable3x duck){
        ducks.add(duck);
    }

    @Override
    public void quack() {
        Iterator iterator=ducks.iterator();
        while (iterator.hasNext()){
            Quackable3x duck=(Quackable3x)iterator.next();
            duck.quack();

        }
    }
    @Override
    public void notifyObservers() {
    }

    @Override
    public void registerObserver(DuckObserver duckObserver) {
        Iterator iterator= ducks.iterator();
        while (iterator.hasNext()){
            Quackable3x duck=(Quackable3x)iterator.next();
            duck.registerObserver(duckObserver);

        }

    }
}
