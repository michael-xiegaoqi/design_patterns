package com.henser.structuralPatterns.composite.simpleExample;

import java.util.ArrayList;

/**
 * 容器构件
 * Created by henser on 17-7-23.
 */
public class Folder implements AbstractFile {

    private String name;
    private ArrayList<AbstractFile> list=new ArrayList<AbstractFile>();
    public Folder(String name){
        this.name=name;
    }

    public void add(AbstractFile file){
        list.add(file);
    }
    public void remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile getChild(int index){
        return list.get(index);
    }

    public void killVirus() {
        System.out.println("---对文件夹"+name+"杀毒");
        for(AbstractFile file:list){
            file.killVirus();
        }

    }

}
