package com.henser.structuralPatterns.proxy.simpleExample;

/**
 * Created by henser on 17-7-25.
 */
public class ProxyClient {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }

}
