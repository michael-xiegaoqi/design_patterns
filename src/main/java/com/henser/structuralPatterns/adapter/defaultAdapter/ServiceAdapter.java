package com.henser.structuralPatterns.adapter.defaultAdapter;

/**
 * Created by henser on 17-7-6.
 */
public class ServiceAdapter implements AbstractService{

    @Override
    public void serviceOperation1() {
    }

    @Override
    public int serviceOperation2() {
        return 0;
    }

    @Override
    public String serviceOperation3() {
        return null;
    }


}