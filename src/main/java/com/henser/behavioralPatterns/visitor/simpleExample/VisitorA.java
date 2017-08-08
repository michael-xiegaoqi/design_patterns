package com.henser.behavioralPatterns.visitor.simpleExample;

/**
 * Created by henser on 2017/8/8.
 */
public class VisitorA implements Visitor {

    /**
     * 对应于NodeA的访问操作
     */
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }
    /**
     * 对应于NodeB的访问操作
     */
    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }

}
