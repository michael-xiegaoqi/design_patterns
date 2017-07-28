package com.henser.structuralPatterns.decorator.simpleExample;

/**
 * 具体装饰角色
 * Created by henser on 17-7-1.
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        // 写相关的业务代码
    }

}
