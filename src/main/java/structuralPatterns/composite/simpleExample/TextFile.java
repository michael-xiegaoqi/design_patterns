package main.java.structuralPatterns.composite.simpleExample;

/**
 * Created by henser on 17-7-23.
 */
public class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name){
        this.name=name;
    }

    public void killVirus() {
        System.out.println("---对文本文件"+name+"杀毒");

    }

}
