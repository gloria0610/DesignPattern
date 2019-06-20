package DesignPattern.CompoundPattern.DuckObserver;


import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by jiangyayi on 19/6/19.
 */
public class Observable implements QuackObservable {

    ArrayList duckObservers=new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck=duck;
    }

    @Override
    public void registerObserver(DuckObserver duckObserver) {
        duckObservers.add(duckObserver);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator=duckObservers.iterator();
        while (iterator.hasNext()){
            DuckObserver duckObserver =(DuckObserver)iterator.next();
            duckObserver.update(duck);
        }
        }



}
