package DesignPattern.IteratorPattern;

import java.util.ArrayList;

/**
 * Created by jiangyayi on 19/6/15.
 */
public class PancakeHouseMenuIterator implements Iterator{
    //
    int point=0;
    ArrayList menuItems;

    public PancakeHouseMenuIterator(ArrayList menuItems){
        this.menuItems=menuItems;
    }

    @Override
    public boolean hasNext() {
        if(point>=menuItems.size()||menuItems.get(point)==null){
            return false;
        }else return true;

    }

    @Override
    public Object next() {
        MenuItem menuItem= (MenuItem) menuItems.get(point);
        point+=1;
        return menuItem;
    }


}
