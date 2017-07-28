package com.henser.structuralPatterns.decorator.scene;

/**
 * Created by henser on 17-7-1.
 */
public class WineMain {

    /**
     * 开始花式调酒
     */
    public static void main(String[] arg) {

        Wine wine = new JackDanielsWine();

        Wine lemonWine = new Lemon(wine);

        Wine spriteWine = new Sprite(lemonWine);


        System.out.println("lemonWine.cost ："+ lemonWine.cost());
        System.out.println("lemonWine.getDesc ：" + lemonWine.getDesc());

        System.out.println("spriteWine.cost ："+ spriteWine.cost());
        System.out.println("spriteWine.getDesc ：" + spriteWine.getDesc());

    }

}
