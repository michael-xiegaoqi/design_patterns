package com.henser.structuralPatterns.proxy.scene;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib 动态代理
 * Created by henser on 17-7-25.
 */
public class CGLibProxy implements MethodInterceptor{

    private static CGLibProxy instance = new CGLibProxy();

    private CGLibProxy(){}

    public static CGLibProxy getInstance(){
        return instance;
    }

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }

    //回调方法
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        before();
        proxy.invokeSuper(obj, args);
        after();
        return null;
    }

    private void before(){
        System.out.println("cook");
    }

    private void after(){
        System.out.println("swap");
    }

}
