package main.java.structuralPatterns.decorator.simpleExample;

/**
 * 具体装饰角色
 * Created by henser on 17-7-1.
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
         super.sampleOperation();
        // 写相关的业务代码
    }

}
