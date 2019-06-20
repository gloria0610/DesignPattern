package DesignPattern.ObserverPattern;

/**
 * Created by jiangyayi on 19/6/11.
 */
public interface Subject {

    public void registerObserver(Object o);

    public void removeObserver(Object o);

    public void notifyObserver();
}
