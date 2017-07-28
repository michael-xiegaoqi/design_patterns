package com.henser.behavioralPatterns.responsibility.simpleExample;

/**
 * Created by henser on 2017/7/28.
 */
public class Client {

    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }

}
