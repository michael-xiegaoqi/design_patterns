package com.henser.creationalPatterns.singleton.hungry;

/**
 * 饿汉式单例类
 * Created by henser on 17-7-3.
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();
    /**
     * 私有默认构造子
     */
    private EagerSingleton(){}
    /**
     * 静态工厂方法
     */
    public static EagerSingleton getInstance(){
        return instance;
    }

}
