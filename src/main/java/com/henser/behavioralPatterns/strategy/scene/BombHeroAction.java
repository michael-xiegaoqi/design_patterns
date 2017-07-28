package com.henser.behavioralPatterns.strategy.scene;

/**
 * Created by henser on 17-6-30.
 */
public class BombHeroAction implements HeroAction{

    @Override
    public void skill() {
        System.out.println("I can bomb ");
    }
}
