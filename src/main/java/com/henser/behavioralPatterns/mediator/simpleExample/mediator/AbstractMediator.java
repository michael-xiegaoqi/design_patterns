package com.henser.behavioralPatterns.mediator.simpleExample.mediator;

/**
 * Created by henser on 2017/8/8.
 */
public abstract class AbstractMediator {

    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();

}
