package main.java.creationalPatterns.abstractFactory.simpleExample;

/**
 * Created by henser on 17-7-3.
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(938);
    }

}
