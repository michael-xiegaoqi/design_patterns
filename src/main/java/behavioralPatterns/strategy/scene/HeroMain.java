package main.java.behavioralPatterns.strategy.scene;

/**
 * Created by henser on 17-6-30.
 */
public class HeroMain {

    public static void main(String[] args) {

        Hero henser = new HenserHero("henser","boy",new BombHeroAction());
        Hero lora = new LoraHero("lora","girl",new ShootHeroAction());

        henser.display();
        lora.display();
        henser.skill();
        lora.skill();

        henser.setHeroAction(new ShootHeroAction());

        henser.skill();

    }

}
