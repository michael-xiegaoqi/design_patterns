package com.henser.creationalPatterns.singleton.lazy;

/**
 * 懒汉式单例类
 * Created by henser on 17-7-3.
 */
public class LazySingleton {

    private static LazySingleton instance = null;
    /**
     * 私有默认构造子
     */
    private LazySingleton(){}
    /**
     * 静态工厂方法
     */
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
