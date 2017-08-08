package com.henser.creationalPatterns.bridge.simpleExample.restaurant;

/**
 * 具体的餐馆：外婆家
 * Created by henser on 2017/8/8.
 */
public class WaiPojia implements Restaurant{

    @Override
    public String taste(){
        return "红烧肉比较一般";
    }

}
