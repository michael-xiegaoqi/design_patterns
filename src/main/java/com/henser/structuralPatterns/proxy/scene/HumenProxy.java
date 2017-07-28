package com.henser.structuralPatterns.proxy.scene;

/**
 * 静态代理
 * Created by henser on 17-7-25.
 */
public class HumenProxy implements Humen {

    private Humen humen;

    public HumenProxy(){
        humen = new HumenImpl();
    }

    @Override
    public void eat(String food){
        before();
        humen.eat(food);
        after();
    }

    private void before(){
        System.out.println("cook");
    }

    private void after(){
        System.out.println("swap");
    }

}
