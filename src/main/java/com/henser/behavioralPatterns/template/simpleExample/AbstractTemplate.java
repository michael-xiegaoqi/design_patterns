package com.henser.behavioralPatterns.template.simpleExample;

/**
 * Created by henser on 17-7-9.
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法
     * 定义为final 是为了防止子类进行重载这个模板方法
     */
    public final void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    /**
     * 基本方法的声明（由子类实现）
     */
    protected abstract void abstractMethod();

    /**
     * 基本方法(空方法)
     */
    protected void hookMethod(){}

    /**
     * 基本方法（已经实现）
     */
    private final void concreteMethod(){
        //业务相关的代码
        System.out.println("具体业务相关的代码");
    }

}
