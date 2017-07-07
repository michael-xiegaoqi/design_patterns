package main.java.behavioralPatterns.observer.scene;

/**
 * Created by henser on 17-6-30.
 */
public class CompanyOrg extends Org{

    private String holiday_notice;

    private String secret_notice;

    @Override
    public void noticeAll() {

        /**
         * 员工列表为空
         */
        if(this.staffList == null
                || this.staffList.isEmpty()) {
            return;
        }

        /**
         * 放假通知信息为空
         */
        if(holiday_notice == null
                || "".equals(holiday_notice)) {
            return;
        }

        for(Staff staff : staffList) {
            staff.update(this,this.getHolidayNotice());
        }

        this.clearNotice();
    }

    public String getHolidayNotice() {
        return this.holiday_notice;
    }

    public void setHolidayNotice(String holiday_notice) {
        this.holiday_notice = holiday_notice;
    }

    public String getSecretNotice() {
        return secret_notice;
    }

    public void setSecretNotice(String secret_notice) {
        this.secret_notice=secret_notice;
    }

    /**
     * 清空消息信息
     */
    private void clearNotice() {
        this.holiday_notice = "";
        this.secret_notice = "";
    }
}
