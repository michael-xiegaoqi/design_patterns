package com.henser.behavioralPatterns.mediator.simpleExample.mediator;

/**
 * Created by henser on 2017/8/8.
 */
public abstract class AbstractColleague {

    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    //注意这里的参数不再是同事类，而是一个中介者
    public abstract void setNumber(int number, AbstractMediator coll);

}
