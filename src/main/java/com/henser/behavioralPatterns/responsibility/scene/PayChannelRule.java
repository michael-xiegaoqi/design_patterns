package com.henser.behavioralPatterns.responsibility.scene;

import java.util.List;

/**
 * Created by henser on 2017/7/28.
 */
public abstract class PayChannelRule {

    public int count;

    public PayChannelRule channel;

    public PayChannelRule(int count) {
        this.count = count;
    }

    public abstract PayChannelVO selectPayChannel();


    public void setNextPayChannel(PayChannelRule channel){
        this.channel = channel;
    }

}
