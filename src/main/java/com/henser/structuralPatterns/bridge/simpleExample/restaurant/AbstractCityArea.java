package com.henser.creationalPatterns.bridge.simpleExample.restaurant;

/**
 * 城市抽象类，这里包含了一个Implementor
 * Created by henser on 2017/8/8.
 */
public abstract class AbstractCityArea {

    protected Restaurant restaurant;

    public AbstractCityArea(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public abstract void commentTaste();

}
