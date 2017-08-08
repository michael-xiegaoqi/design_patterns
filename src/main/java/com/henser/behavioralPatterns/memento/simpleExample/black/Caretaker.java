package com.henser.behavioralPatterns.memento.simpleExample.black;

/**
 * 负责人角色类Caretaker能够得到的备忘录对象是以MementoIF为接口的，
 * 由于这个接口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容。
 * Created by henser on 2017/8/8.
 */
public class Caretaker {

    private MementoIF memento;
    /**
     * 备忘录取值方法
     */
    public MementoIF retrieveMemento(){
        return memento;
    }
    /**
     * 备忘录赋值方法
     */
    public void saveMemento(MementoIF memento){
        this.memento = memento;
    }

}
