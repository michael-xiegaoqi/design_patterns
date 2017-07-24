package main.java.structuralPatterns.composite.simpleExample;

/**
 * Created by henser on 17-7-23.
 */
public class Client {

    public static void main(String[] args) {
        Folder f1;
        AbstractFile f2,f3;

        f1=new Folder("我的收藏");
        f2=new ImageFile("my.jpg");
        f3=new TextFile("my.txt");
        f1.add(f2);
        f1.add(f3);
        f1.killVirus();

    }

}
