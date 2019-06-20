package DesignPattern.CompositePattern;

/**
 * Created by jiangyayi on 19/6/18.
 */
public class WaitressComposite {

    MenuComponent allMenus;

    public WaitressComposite(MenuComponent allMenus){
        this.allMenus=allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
