package com.henser.structuralPatterns.proxy.scene;

/**
 * Created by henser on 17-7-25.
 */
public class ProxyClient {

    public static void main(String[] args){
        Humen humenProxy = new HumenProxy();
        humenProxy.eat("rice");
    }

}
