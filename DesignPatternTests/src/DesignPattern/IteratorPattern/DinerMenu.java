package DesignPattern.IteratorPattern;


/**
 * Created by jiangyayi on 19/6/15.
 */
public class DinerMenu {

    static final int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] menuItems;

    public DinerMenu(){

        menuItems=new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","Bacon with lettuce &tomato on whole wheat",true,2.99);
        addItem(" BLT","Bacon with lettuce &tomato on whole wheat",false,2.99);
        addItem("Soup of the day","with salad",false,2.99);
        addItem("HotDog","with saurkraut,onions,topped with cheese",false,3.99);

    }

    public void addItem(String name,String description,boolean vegetarian,double price){

        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);

        if(numberOfItems>=MAX_ITEMS){System.err.println("menu is full");}
        else {
            menuItems[numberOfItems]=menuItem;
            numberOfItems=numberOfItems+1;
        }

    }

    public Iterator creatIterator(){
        return new DinerMenuIterator(menuItems);

    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

}
