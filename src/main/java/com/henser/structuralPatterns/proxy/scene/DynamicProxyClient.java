package com.henser.structuralPatterns.proxy.scene;

/**
 * Created by henser on 17-7-25.
 */
public class DynamicProxyClient {

    public static void main(String[] args) {

        DynamicProxy dynamicProxy = new DynamicProxy(new HumenImpl());

        Humen humenProxy = dynamicProxy.getProxy();

        humenProxy.eat("fruit");

    }

}
