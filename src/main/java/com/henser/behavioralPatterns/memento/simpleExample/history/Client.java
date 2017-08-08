package com.henser.behavioralPatterns.memento.simpleExample.history;

/**
 * Created by henser on 2017/8/8.
 */
public class Client {

    public static void main(String[] args) {

        Originator o = new Originator();
        //修改状态
        o.changeState("state 0");
        //创建备忘录
        MementoIF memento = o.createMemento();
        //修改状态
        o.changeState("state 1");
        //按照备忘录恢复对象的状态
        o.restoreMemento(memento);

    }

}
