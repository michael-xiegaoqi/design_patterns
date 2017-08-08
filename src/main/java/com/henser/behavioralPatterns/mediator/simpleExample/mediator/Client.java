package com.henser.behavioralPatterns.mediator.simpleExample.mediator;

/**
 *
 * 把原来处理对象关系的代码重新封装到一个中介类中，通过这个中介类来处理对象间的关系
 *
 * Created by henser on 2017/8/8.
 */
public class Client {

    public static void main(String[] args){

        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();

        AbstractMediator am = new Mediator(collA, collB);

        System.out.println("==========通过设置A影响B==========");
        collA.setNumber(1000, am);
        System.out.println("collA的number值为："+collA.getNumber());
        System.out.println("collB的number值为A的100倍："+collB.getNumber());

        System.out.println("==========通过设置B影响A==========");
        collB.setNumber(1000, am);
        System.out.println("collB的number值为："+collB.getNumber());
        System.out.println("collA的number值为B的0.1倍："+collA.getNumber());

    }

}
