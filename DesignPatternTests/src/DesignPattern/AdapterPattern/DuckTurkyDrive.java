package DesignPattern.AdapterPattern;

/**
 * Created by jiangyayi on 19/6/14.
 */
public class DuckTurkyDrive {

    public static void main(String args[]){
        GreenDuck greenDuck=new GreenDuck();
        BigTurkey turkey=new BigTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(turkey);
        Turky duckAdapter=new DuckAdapter(greenDuck);

        System.out.println("the duck :");
        greenDuck.quack();

        System.out.println("the turky :");
        turkey.gobble();

        System.out.println("the turkeyAdapter :");
        turkeyAdapter.quack();

        System.out.println("the duckAdapter :");
        duckAdapter.gobble();


    }
}
