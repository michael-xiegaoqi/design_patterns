package com.henser.behavioralPatterns.state.simpleExample;

/**
 * Created by henser on 17-7-24.
 */
public class StateClient {

    public static void main(String[] args){
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }

}
