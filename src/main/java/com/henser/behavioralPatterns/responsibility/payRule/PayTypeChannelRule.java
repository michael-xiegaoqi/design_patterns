package com.henser.behavioralPatterns.responsibility.payRule;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据 进件类型（个人/企业借款) 规则匹配支付渠道
 * Created by henser on 2017/7/28.
 */
public class PayTypeChannelRule extends PayChannelRule {

    @Override
    public List<PayChannelVO> findPayChannel() {
        System.out.println("根据 进件类型 开始匹配支付渠道");
        PayChannelVO channelVO_A = new PayChannelVO("进件类型支付渠道");
        PayChannelVO channelVO_B = new PayChannelVO("进件类型支付渠道");
        List<PayChannelVO> list = new ArrayList<PayChannelVO>();
        list.add(channelVO_A);
        list.add(channelVO_B);
        return list;
    }

    @Override
    public void setNextPayChannel() {
        nextChannel = new PayTimeChannelRule();
    }

}
