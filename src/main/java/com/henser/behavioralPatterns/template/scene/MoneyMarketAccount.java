package com.henser.behavioralPatterns.template.scene;

/**
 * 具体模板角色类
 * Created by henser on 17-7-9.
 */
public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {

        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {

        return 0.045;
    }

}
