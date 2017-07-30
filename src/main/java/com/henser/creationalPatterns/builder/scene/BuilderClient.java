package com.henser.creationalPatterns.builder.scene;

/**
 * Created by henser on 2017/7/28.
 */
public class BuilderClient {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");

    }

}
