package com.henser.behavioralPatterns.strategy.scene;

/**
 * Created by henser on 17-6-30.
 */
public abstract class Hero {

    public String name;

    public String features;

    private HeroAction heroAction;

    public Hero(String name, String features, HeroAction heroAction) {
        this.name=name;
        this.features=features;
        this.heroAction=heroAction;
    }

    public abstract void display();

    public void setHeroAction(HeroAction heroAction) {
        this.heroAction = heroAction;
    }

    public void skill() {
        this.heroAction.skill();
    }
}
