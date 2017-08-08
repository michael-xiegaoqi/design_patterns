package com.henser.behavioralPatterns.mediator.simpleExample.mediator;

/**
 * Created by henser on 2017/8/8.
 */
public class ColleagueB extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }

}
