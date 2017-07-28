package com.henser.behavioralPatterns.state.simpleExample;

/**
 * 具体状态类
 * Created by henser on 17-7-24.
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }

}
