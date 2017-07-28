package com.henser.behavioralPatterns.responsibility.scene;

/**
 * 根据 额度 规则匹配支付渠道
 * Created by henser on 2017/7/28.
 */
public class PayLimitChannelRule extends PayChannelRule {

    public PayLimitChannelRule(int count) {
        super(count);
    }

    @Override
    public PayChannelVO selectPayChannel() {

        System.out.println("根据 额度 开始匹配支付渠道");

        //根据 额度 获取支付渠道列表
        if(super.count == 1) {
            System.out.println("根据 额度 匹配到支付渠道");
            return new PayChannelVO("额度支付渠道");
        }else{
            //没有下个匹配规则
            System.out.println("没有匹配支付渠道");
        }

        return null;
    }

}
