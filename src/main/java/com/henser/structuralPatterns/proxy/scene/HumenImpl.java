package com.henser.structuralPatterns.proxy.scene;

/**
 * 无代理模式
 * Created by henser on 17-7-25.
 */
public class HumenImpl implements Humen{

    @Override
    public void eat(String food){
        System.out.println("eat " + food);
    }
    
}
