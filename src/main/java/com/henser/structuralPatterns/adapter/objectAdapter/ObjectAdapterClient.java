package com.henser.structuralPatterns.adapter.objectAdapter;

/**
 * Created by henser on 17-7-6.
 */
public class ObjectAdapterClient {

    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();

        Adapter adapter = new Adapter(adaptee);

        adapter.sampleOperation1();

        adapter.sampleOperation2();

    }

}
