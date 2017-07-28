package com.henser.structuralPatterns.proxy.scene;

/**
 * Created by henser on 17-7-25.
 */
public class CGLibproxyClient {

    public static void main(String[] atgs){
        Humen humenProxy = CGLibProxy.getInstance().getProxy(HumenImpl.class);
        humenProxy.eat("rice");
    }

}
