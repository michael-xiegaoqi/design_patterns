package com.henser.creationalPatterns.prototype.prototypeManager;

/**
 * 抽象原型角色
 * Created by henser on 2017/8/7.
 */
public interface Prototype {

    public Prototype clone();
    public String getName();
    public void setName(String name);

}
