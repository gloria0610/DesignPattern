package DesignPattern.CompoundPattern.Factory.FlockComposite;

import DesignPattern.CompoundPattern.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jiangyayi on 19/6/19.
 */
public class Flock implements Quackable {

    //使用组合模式，使用迭代器创建群组鸭子树型结构

    ArrayList quackers=new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator=quackers.iterator();
          while (iterator.hasNext()){
              Quackable quacker=(Quackable)iterator.next();
              quacker.quack();
          }
    }
}
