package DesignPattern.TemplateMethod;

/**
 * Created by jiangyayi on 19/6/14.
 */
public class TemplateTest {

    public static void  main(String args[]){
        Caffee caffee = new Caffee();
        Tea tea = new Tea();
        caffee.prepareRecipe();
        tea.prepareRecipe();

        System.out.println("-------------------------");
        CaffeineBeverage caffee1=new Caffee();
        CaffeineBeverage tea1 =new Tea();
        caffee1.prepareRecipe();
        tea1.prepareRecipe();
    }
}
