package com.henser.structuralPatterns.adapter.classAdapter;

/**
 * Created by henser on 17-7-6.
 */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();

}
