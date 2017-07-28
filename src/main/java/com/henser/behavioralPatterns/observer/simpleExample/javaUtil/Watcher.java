package com.henser.behavioralPatterns.observer.simpleExample.javaUtil;

/**
 * Created by henser on 17-6-30.
 */
public class Watcher implements Observer {

    public Watcher(Observable o){
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("状态发生改变：" + ((Watched)o).getData());
    }

}
