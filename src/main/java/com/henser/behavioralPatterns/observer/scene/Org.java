package com.henser.behavioralPatterns.observer.scene;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by henser on 17-6-30.
 */
public abstract class Org {

    public List<Staff> staffList = new ArrayList<Staff>();

    /**
     * 加入员工
     * @param staff
     */
    public void addStaff(Staff staff) {

        if(staff == null) {
            return;
        }

        if(staffList == null) {
            synchronized (this){
                if(staffList == null) {
                    staffList = new ArrayList<Staff>();
                }
            }
        }

        if(staffList.contains(staff)) {
            return;
        }

        staffList.add(staff);

    }

    /**
     * 移除员工
     * @param staff
     */
    public void removeStaff(Staff staff) {

        if(staff == null) {
            return;
        }

        if(staffList == null
                || staffList.isEmpty()
                || !staffList.contains(staff)) {
            return;
        }

        staffList.remove(staff);

    }

    public abstract void noticeAll();
}
