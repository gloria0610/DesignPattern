package DesignPattern.CompoundPattern;

/**
 * Created by jiangyayi on 19/6/19.
 */

//鹅鸭适配器
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose=goose;
    }

    @Override
    public void quack() {
        goose.honk();

    }
}
