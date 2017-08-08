package com.henser.creationalPatterns.bridge.simpleExample.vehicle;

/**
 * Created by henser on 2017/8/8.
 */
public class VehicleClient {

    public static void main(String[] args) {

        Road road = new CementRoad(new Car());
        road.driveOnRoad();

        road = new CementRoad(new Bus());
        road.driveOnRoad();

        road = new UnpavedRoad(new Bus());
        road.driveOnRoad();

    }


}
