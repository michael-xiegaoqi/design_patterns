package com.henser.behavioralPatterns.observer.simpleExample.pull;

/**
 * 客户端类
 * Created by henser on 17-6-30.
 */
public class PullClient {

    public static void main(String[] args) {

        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();

        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");

        //将观察者对象剔除主题对象
        subject.detach(observer);
        //改变主题对象的状态
        subject.change("change state");

    }

}
