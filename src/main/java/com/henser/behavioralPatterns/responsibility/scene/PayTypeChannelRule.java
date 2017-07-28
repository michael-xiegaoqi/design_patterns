package com.henser.behavioralPatterns.responsibility.scene;

/**
 * 根据 进件类型（个人/企业借款) 规则匹配支付渠道
 * Created by henser on 2017/7/28.
 */
public class PayTypeChannelRule extends PayChannelRule {

    public PayTypeChannelRule(int count) {
        super(count);
    }

    @Override
    public PayChannelVO selectPayChannel() {

        //根据 进件类型（个人/企业借款） 获取支付渠道列表
        System.out.println("根据 进件类型 开始匹配支付渠道");
        if(count == 1) {
            System.out.println("根据 进件类型 匹配到支付渠道");
            return new PayChannelVO("进件类型支付渠道");
        }

        if(count > 1) {
            //进行下个匹配规则
            System.out.println("根据 进件类型 匹配到多个支付渠道");
            //设置下个规则
            setNextPayChannel(new PayTimeChannelRule(2));
            //下个规则开始匹配
            return channel.selectPayChannel();
        }

        System.out.println("根据 进件类型 匹配不到支付渠道");

        return null;
    }

}
