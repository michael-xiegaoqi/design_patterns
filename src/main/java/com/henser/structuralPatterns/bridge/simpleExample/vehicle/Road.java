package com.henser.creationalPatterns.bridge.simpleExample.vehicle;

/**
 * Created by henser on 2017/8/8.
 */
public abstract class Road {

    protected Vehicle vehicle;

    public Road(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public abstract void driveOnRoad();

}
