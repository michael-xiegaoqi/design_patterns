package com.henser.behavioralPatterns.responsibility.scene;

/**
 * 根据 时效 规则匹配支付渠道
 * Created by henser on 2017/7/28.
 */
public class PayTimeChannelRule extends PayChannelRule {

    public PayTimeChannelRule(int count) {
        super(count);
    }

    @Override
    public PayChannelVO selectPayChannel() {

        System.out.println("根据 时效 开始匹配支付渠道");

        //根据 时效 获取支付渠道列表
        if(this.count == 1) {
            System.out.println("根据 时效 匹配到支付渠道");
            return new PayChannelVO("时效支付渠道");
        }

        if(count > 1) {
            //进行下个匹配规则
            System.out.println("根据 时效 匹配到多个支付渠道");
            //设置下个规则
            setNextPayChannel(new PayLimitChannelRule(1));
            //下个规则开始匹配
            return channel.selectPayChannel();
        }

        System.out.println("根据 时效 匹配不到支付渠道");

        return null;
    }

}
