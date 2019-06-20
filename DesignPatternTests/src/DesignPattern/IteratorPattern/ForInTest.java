package DesignPattern.IteratorPattern;

import java.util.ArrayList;

/**
 * Created by jiangyayi on 19/6/17.
 */
public class ForInTest {

    public static void main(String args[]){
        ArrayList<MenuItem> items=new ArrayList();

        items.add(new MenuItem("xxx","yyy",true,1.59));
        items.add(new MenuItem("xxx1", "yyy1", true, 1.59));
        items.add(new MenuItem("xxx2", "yyy2", true, 1.59));
        items.add(new MenuItem("xxx3", "yyy3", true, 1.59));



        for (MenuItem item:items){
            System.out.println("items:"+item.name);

        }
    }


}
