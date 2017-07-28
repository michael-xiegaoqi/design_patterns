package com.henser.behavioralPatterns.responsibility.scene;

/**
 * Created by henser on 2017/7/28.
 */
public class PayChannelVO {

    private String name;

    public PayChannelVO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PayChannelVO{" +
                "name='" + name + '\'' +
                '}';
    }
}
