package com.henser.behavioralPatterns.mediator.simpleExample.noMediator;

/**
 * Created by henser on 2017/8/8.
 */
public class ColleagueA extends AbstractColleague{

    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number*100);
    }

}
