package com.henser.structuralPatterns.proxy.simpleExample;

/**
 * 目标对象角色
 * Created by henser on 17-7-25.
 */
public class RealObject extends AbstractObject{

    @Override
    public void operation() {
        //一些操作
        System.out.println("一些操作");
    }

}
