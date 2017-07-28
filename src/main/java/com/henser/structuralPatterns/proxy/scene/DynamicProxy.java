package com.henser.structuralPatterns.proxy.scene;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理
 * Created by henser on 17-7-25.
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target){
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    private void before(){
        System.out.println("cook");
    }

    private void after(){
        System.out.println("swap");
    }

    //创建接口实现类
    public <T> T getProxy(){
        /**
         * a是委托类的实现类，在这里就是new HumenImpl()；
         * b是委托类接口，在这里就是Humen HumenImpl.getClass().getInterfaces()；
         * c是代理类处理委托类的处理器InvocationHandler，需要我们另外实现，在这里就是DynamicProxy
         * 通过Proxy.newProxyInstance(a,b,c)的时候将DynamicProxy绑定到Proxy生成的代理类中Humen，
         * 当代理类调用接口方法Humen.eat()时，代理业务处理器proxy会自动调用invoke()方法。
         */
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

}
