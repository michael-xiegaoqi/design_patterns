package com.henser.behavioralPatterns.observer.scene;

/**
 * Created by henser on 17-6-30.
 */
public class NoticeStaffMain {

    public static void main(String[] arg) {

        CompanyOrg org = new CompanyOrg();

        HenserStaff henserStaff = new HenserStaff(org);

        LoraStaff loraStaff = new LoraStaff(org);

        org.setHolidayNotice("明天开始放假");
        org.setSecretNotice("你加薪升职了");

        org.noticeAll();

        org.noticeAll();
    }

}
