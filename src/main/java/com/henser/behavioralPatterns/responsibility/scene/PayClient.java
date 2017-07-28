package com.henser.behavioralPatterns.responsibility.scene;

/**
 * Created by henser on 2017/7/28.
 */
public class PayClient {

    public static void main(String[] args) {

        PayChannelRule payChannelRule = new PayTypeChannelRule(3);

        PayChannelVO payChannelVO = payChannelRule.selectPayChannel();

        if(payChannelVO != null) {
            System.out.println("匹配到的支付渠道是："+payChannelVO.toString());
        }

    }

}
