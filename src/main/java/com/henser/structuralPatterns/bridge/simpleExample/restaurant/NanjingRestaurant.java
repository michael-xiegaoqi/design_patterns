package com.henser.creationalPatterns.bridge.simpleExample.restaurant;

/**
 * 具体的城市类
 * Created by henser on 2017/8/8.
 */
public class NanjingRestaurant extends AbstractCityArea {

    public NanjingRestaurant(Restaurant restaurant){
        super(restaurant);
    }

    @Override
    public void commentTaste(){
        System.out.println("南京的"+super.restaurant.taste());
    }

}
