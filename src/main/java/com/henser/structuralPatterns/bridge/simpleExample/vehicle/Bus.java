package com.henser.creationalPatterns.bridge.simpleExample.vehicle;

/**
 * 具体的交通工具（ConcreteImplementor）
 * Created by henser on 2017/8/8.
 */
public class Bus implements Vehicle {

    @Override
    public void drive(){
        System.out.print("大巴");
    }

}
