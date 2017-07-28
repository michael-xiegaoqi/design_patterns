package com.henser.behavioralPatterns.command.simpleExample;

/**
 * 请求者角色类
 * Created by henser on 17-7-4.
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){

        command.execute();
    }

}
