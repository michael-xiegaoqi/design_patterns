package com.henser.behavioralPatterns.observer.scene;

/**
 * Created by henser on 17-6-30.
 */
public class LoraStaff implements Staff{

    private Org org;

    public LoraStaff(Org org) {
        this.org=org;
        //加入员工
        this.org.addStaff(this);
    }

    @Override
    public void update(Org org, Object arg) {

        System.out.println("lora 收到通知");

        System.out.println("通知信息 ："+arg);

        System.out.println("lora 收到秘密通知");

        String secret_notice = ((CompanyOrg)org).getSecretNotice();

        System.out.println("秘密通知 :" +secret_notice);
    }
}
