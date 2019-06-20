package DesignPattern.CompositePattern;

/**
 * Created by jiangyayi on 19/6/18.
 */
public class MenuTestDrive {

    public static void main(String args[]){
        MenuComponent pancakeHouseMenu=new Menu("PANCAKE HOUSE MENU","BREAKFAST");
        MenuComponent dinerMenu=new Menu("DINNER MENU","LUNCH");
        MenuComponent cafeMenu=new Menu("CAFFEE","FOR AFTERNOON");
        MenuComponent dessertMenu=new Menu("dessert","not ready");

        MenuComponent allMenus=new Menu("ALL","ALL OF THINGS");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("KB'S Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99));
        pancakeHouseMenu.add(new MenuItem("KB'S Pancake Breakfast2","Pancakes with scrambled eggs,tomato,and toast",true,3.99));

        dinerMenu.add(new MenuItem("Vegetarian BLT","Bacon with lettuce &tomato on whole wheat",true,2.99));
        dinerMenu.add(new MenuItem(" BLT","Bacon with lettuce &tomato on whole wheat",false,2.99));

        cafeMenu.add(new MenuItem("Latte","esspriso+milk+honey",true,1.99));
        cafeMenu.add(new MenuItem("cafe","esspriso double",true,0.99));


        WaitressComposite waitressComposite=new WaitressComposite(allMenus);
        waitressComposite.printMenu();
    }
}
