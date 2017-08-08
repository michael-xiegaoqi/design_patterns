package com.henser.behavioralPatterns.visitor.simpleExample;

/**
 * Created by henser on 2017/8/8.
 */
public class NodeA extends Node{

    /**
     * 接受操作
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeA特有的方法
     */
    public String operationA(){
        return "NodeA";
    }

}
