package com.henser.structuralPatterns.adapter.classAdapter;

/**
 * Created by henser on 17-7-6.
 */
public class ClassAdapterClient {

    public static void main(String[] args) {

        Adapter adapter = new Adapter();

        adapter.sampleOperation1();

        adapter.sampleOperation2();

    }

}
