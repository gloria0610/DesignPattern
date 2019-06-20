package DesignPattern.IteratorPattern;

/**
 * Created by jiangyayi on 19/6/17.
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu){
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
