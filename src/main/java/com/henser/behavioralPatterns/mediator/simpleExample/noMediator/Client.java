package com.henser.behavioralPatterns.mediator.simpleExample.noMediator;

/**
 *
 * 有两个类A和B，类中各有一个数字，并且要保证类B中的数字永远是类A中数字的100倍。
 * 也就是说，当修改类A的数时，将这个数字乘以100赋给类B，而修改类B时，要将数除以100赋给类A。
 * 类A类B互相影响，就称为同事类。
 *
 * Created by henser on 2017/8/8.
 */
public class Client {

    public static void main(String[] args){

        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();

        System.out.println("==========设置A影响B==========");
        collA.setNumber(1288, collB);
        System.out.println("collA的number值："+collA.getNumber());
        System.out.println("collB的number值："+collB.getNumber());

        System.out.println("==========设置B影响A==========");
        collB.setNumber(87635, collA);
        System.out.println("collB的number值："+collB.getNumber());
        System.out.println("collA的number值："+collA.getNumber());
    }

}
