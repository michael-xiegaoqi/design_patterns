package com.henser.behavioralPatterns.visitor.simpleExample;

/**
 * Created by henser on 2017/8/8.
 */
public class NodeB extends Node {

    /**
     * 接受方法
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeB特有的方法
     */
    public String operationB(){
        return "NodeB";
    }

}
