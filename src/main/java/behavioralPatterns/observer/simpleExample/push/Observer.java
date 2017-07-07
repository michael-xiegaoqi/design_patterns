package main.java.behavioralPatterns.observer.simpleExample.push;

/**
 * 抽象观察者角色类
 * Created by henser on 17-6-30.
 */
public interface Observer {

    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);

}
