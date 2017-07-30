package com.henser.creationalPatterns.builder.simpleExample;

/**
 * Created by henser on 2017/7/28.
 */
public class BuilderClient {

    public static void main(String[]args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }

}
