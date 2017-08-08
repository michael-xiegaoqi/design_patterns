package com.henser.creationalPatterns.bridge.simpleExample.restaurant;

/**
 * 具体的餐馆：小南国
 * Created by henser on 2017/8/8.
 */
public class XiaoNanGuo implements Restaurant {

    @Override
    public String taste() {
        return "红烧肉比较好吃";
    }
}
