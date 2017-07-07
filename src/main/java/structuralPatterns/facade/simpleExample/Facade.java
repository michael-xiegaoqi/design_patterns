package main.java.structuralPatterns.facade.simpleExample;

/**
 * Created by henser on 17-7-7.
 */
public class Facade {

    //示意方法，满足客户端需要的功能
    public void test(){
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }

}
