package main.java.behavioralPatterns.strategy.scene;

/**
 * Created by henser on 17-6-30.
 */
public class HenserHero extends  Hero{

    public HenserHero(String name, String features, HeroAction heroAction) {
        super(name, features, heroAction);
    }

    @Override
    public void display() {
        System.out.println("I am "+this.name+" hero and I'm features is "+this.features);
    }
}
