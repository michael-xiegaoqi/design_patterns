package com.henser.behavioralPatterns.state.simpleExample;

/**
 * 抽象状态类
 * Created by henser on 17-7-24.
 */
public interface State {

    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);

}
