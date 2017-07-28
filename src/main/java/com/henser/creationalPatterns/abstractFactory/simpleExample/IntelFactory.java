package com.henser.creationalPatterns.abstractFactory.simpleExample;

/**
 * Created by henser on 17-7-3.
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }

}
