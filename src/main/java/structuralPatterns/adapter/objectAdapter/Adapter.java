package main.java.structuralPatterns.adapter.objectAdapter;

/**
 * Created by henser on 17-7-6.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee=adaptee;
    }

    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    @Override
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        //写相关的代码
        System.out.println("适配的方法");
    }

}
