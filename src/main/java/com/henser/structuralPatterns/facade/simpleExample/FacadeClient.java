package com.henser.structuralPatterns.facade.simpleExample;

/**
 * Created by henser on 17-7-7.
 */
public class FacadeClient {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.test();
    }

}
