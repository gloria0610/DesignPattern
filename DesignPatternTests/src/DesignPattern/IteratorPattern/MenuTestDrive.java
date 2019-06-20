package DesignPattern.IteratorPattern;

/**
 * Created by jiangyayi on 19/6/17.
 */
public class MenuTestDrive {

    public static void main(String args[]){
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();

        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
     }
}
