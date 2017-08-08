package com.henser.creationalPatterns.prototype.simpleExample;

/**
 * 抽象原型角色
 * Created by henser on 2017/8/7.
 */
public interface Prototype {

    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Prototype clone();

}
