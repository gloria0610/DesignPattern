package DesignPattern.IteratorPattern;

/**
 * Created by jiangyayi on 19/6/15.
 */

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position=0;

    public DinerMenuIterator(MenuItem[] menuItems){
        this.menuItems=menuItems;
    }

    @Override
    public Object next() {
        MenuItem menuItem=menuItems[position];
        position+=1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position>=menuItems.length||menuItems[position]==null){
            return false;
        }else return true;

    }



}
