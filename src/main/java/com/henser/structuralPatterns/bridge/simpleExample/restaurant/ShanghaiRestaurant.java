package com.henser.creationalPatterns.bridge.simpleExample.restaurant;

/**
 *
 * Created by henser on 2017/8/8.
 */
public class ShanghaiRestaurant extends AbstractCityArea {

    public ShanghaiRestaurant(Restaurant restaurant){
        super(restaurant);
    }

    @Override
    public void commentTaste() {
        System.out.println("上海的"+super.restaurant.taste());
    }

}
