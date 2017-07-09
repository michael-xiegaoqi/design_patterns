package main.java.behavioralPatterns.template.scene;

/**
 * 具体模板角色类
 * Created by henser on 17-7-9.
 */
public class CDAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }

}
