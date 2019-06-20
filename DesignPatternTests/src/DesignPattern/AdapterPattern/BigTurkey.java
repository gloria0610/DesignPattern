package DesignPattern.AdapterPattern;

/**
 * Created by jiangyayi on 19/6/14.
 */
public class BigTurkey implements Turky {

    @Override
    public void fly() {
        System.out.println("sasasasasasasa");
    }

    @Override
    public void gobble() {
        System.out.println("guguguguuuu");
    }
}
