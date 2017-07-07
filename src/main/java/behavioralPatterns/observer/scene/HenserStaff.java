package main.java.behavioralPatterns.observer.scene;

/**
 * Created by henser on 17-6-30.
 */
public class HenserStaff implements Staff{

    private Org org;

    public HenserStaff(Org org) {
        this.org=org;
        //加入员工
        this.org.addStaff(this);
    }

    @Override
    public void update(Org org, Object arg) {

        System.out.println("henser 收到通知");

        System.out.println("通知信息："+arg);

    }
}
