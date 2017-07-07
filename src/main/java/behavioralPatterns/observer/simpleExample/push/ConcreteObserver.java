package main.java.behavioralPatterns.observer.simpleExample.push;

/**
 * 具体观察者角色类
 * Created by henser on 17-6-30.
 */
public class ConcreteObserver implements Observer{

    //观察者的状态
    private String observerState;

    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("更新观察者的状态为："+observerState);
    }

}