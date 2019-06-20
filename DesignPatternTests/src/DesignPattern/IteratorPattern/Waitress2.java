package DesignPattern.IteratorPattern;

/**
 * Created by jiangyayi on 19/6/17.
 */
public class Waitress2 {
    //使用java自带的迭代器方法
    //数组不支持此方法，还是要自己写
    //使用Menu接口可以针对接口编程，而不是针对实现编程，解耦

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress2(Menu pancakeHouseMenu, Menu dinerMenu){
        this.dinerMenu=dinerMenu;
        this.pancakeHouseMenu=pancakeHouseMenu;

    }

    public void printMenu(){
        Iterator pancakeIterator=pancakeHouseMenu.creatIterator();
        Iterator dinerIterator=dinerMenu.creatIterator();

        System.out.println("MENU\n--------------------\nBreakFast");
        printMenus(pancakeIterator);

        System.out.println("\nLunch");
        printMenus(dinerIterator);

    }

    public void printMenus(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem=(MenuItem)iterator.next();
            System.out.println(menuItem.getName() + "," + menuItem.getPrice() + menuItem.description);
        }
    }
}
