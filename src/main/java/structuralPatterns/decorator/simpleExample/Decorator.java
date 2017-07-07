package main.java.structuralPatterns.decorator.simpleExample;

/**
 * 装饰角色
 * Created by henser on 17-7-1.
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        // 委派给构件
        component.sampleOperation();
    }

}
