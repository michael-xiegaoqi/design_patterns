package main.java.structuralPatterns.decorator.scene;

/**
 * Created by henser on 17-7-1.
 */
public class BeerWine implements Wine {

    @Override
    public double cost() {
        return 5;
    }

    @Override
    public String getDesc() {
        return "BeerDrink";
    }
}
