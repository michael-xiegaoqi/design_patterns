package com.henser.structuralPatterns.decorator.scene;

/**
 * Created by henser on 17-7-1.
 */
public class Sprite extends Bartender{

    public Sprite(Wine wine) {
        super(wine);
    }

    @Override
    public double cost() {
        return 30 + this.wine.cost();
    }

    @Override
    public String getDesc() {
        return "Sprite Bartender " + this.wine.getDesc();
    }
}
