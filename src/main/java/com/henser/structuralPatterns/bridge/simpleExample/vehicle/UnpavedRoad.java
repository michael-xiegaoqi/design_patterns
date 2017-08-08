package com.henser.creationalPatterns.bridge.simpleExample.vehicle;

/**
 * Created by henser on 2017/8/8.
 */
public class UnpavedRoad extends Road{

    public UnpavedRoad(Vehicle vehicle){
        super(vehicle);
    }

    @Override
    public void driveOnRoad(){
        super.vehicle.drive();
        System.out.println("行驶在石子路");
    }

}
