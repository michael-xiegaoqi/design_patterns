package main.java.structuralPatterns.decorator.scene;

/**
 * Created by henser on 17-7-1.
 */
public abstract class Bartender implements Wine{

    Wine wine;

    public Bartender(Wine wine) {
        this.wine=wine;
    }

    public abstract double cost();

    public abstract String getDesc();

}
