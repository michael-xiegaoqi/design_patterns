package com.henser.structuralPatterns.composite.simpleExample;

/**
 * 叶子构件
 * Created by henser on 17-7-23.
 */
public class ImageFile implements AbstractFile{

    private String name;

    public ImageFile(String name){
        this.name=name;
    }

    public void killVirus() {
        System.out.println("---对图像文件"+name+"杀毒");

    }

}
