package com.henser.creationalPatterns.abstractFactory.simpleExample;

/**
 * Created by henser on 17-7-3.
 */
public class ComputerClient {

    public static void main(String[]args){
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new IntelFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);

        //客户选择换一个需要使用的产品对象
        af = new AmdFactory();

        cf.makeComputer(af);
    }

}
