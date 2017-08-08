package com.henser.creationalPatterns.bridge.simpleExample.restaurant;

/**
 * 评判一个地方红烧肉的口味，这里出现了两个维度的变化：地域和餐馆品牌
 * Created by henser on 2017/8/8.
 */
public class RestaurantClient {

    public static void main(String[] args) {

        Restaurant rest = new XiaoNanGuo();
        AbstractCityArea sr = new ShanghaiRestaurant(rest);
        sr.commentTaste();

        rest = new WaiPojia();
        sr = new NanjingRestaurant(rest);

        sr.commentTaste();

    }

}
