package main.java.structuralPatterns.decorator.scene;

/**
 * Created by henser on 17-7-1.
 */
public class XOWine implements Wine {

    @Override
    public double cost() {
        return 1000;
    }

    @Override
    public String getDesc() {
        return "XOWine";
    }

}
