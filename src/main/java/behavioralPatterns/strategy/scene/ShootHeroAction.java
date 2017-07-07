package main.java.behavioralPatterns.strategy.scene;

/**
 * Created by henser on 17-6-30.
 */
public class ShootHeroAction  implements HeroAction{

    @Override
    public void skill() {
        System.out.println("I can shoot ");
    }
}
