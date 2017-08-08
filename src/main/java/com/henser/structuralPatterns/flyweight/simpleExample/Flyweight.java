package com.henser.structuralPatterns.flyweight.simpleExample;

/**
 * 抽象享元角色类
 * Created by henser on 2017/8/8.
 */
public interface Flyweight {

    //一个示意性方法，参数state是外蕴状态
    public void operation(String state);

}
