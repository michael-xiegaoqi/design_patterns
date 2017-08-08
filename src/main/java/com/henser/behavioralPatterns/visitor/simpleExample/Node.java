package com.henser.behavioralPatterns.visitor.simpleExample;

/**
 * Created by henser on 2017/8/8.
 */
public abstract class Node {

    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);

}
