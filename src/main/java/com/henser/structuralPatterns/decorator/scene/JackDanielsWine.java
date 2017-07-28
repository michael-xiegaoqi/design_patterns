package com.henser.structuralPatterns.decorator.scene;

/**
 * Created by henser on 17-7-1.
 */
public class JackDanielsWine implements Wine{

    @Override
    public double cost() {
        return 500;
    }

    @Override
    public String getDesc() {
        return "JackDanielsWine";
    }

}
