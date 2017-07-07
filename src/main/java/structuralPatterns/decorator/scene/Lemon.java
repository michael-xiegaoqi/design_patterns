package main.java.structuralPatterns.decorator.scene;

/**
 * Created by henser on 17-7-1.
 */
public class Lemon extends Bartender{

    public Lemon(Wine wine) {
        super(wine);
    }

    @Override
    public double cost() {
        return 50 + this.wine.cost();
    }

    @Override
    public String getDesc() {
        return "Lemon Bartender " + this.wine.getDesc();
    }
}
