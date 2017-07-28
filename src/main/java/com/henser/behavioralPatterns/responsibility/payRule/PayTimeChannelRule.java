package com.henser.behavioralPatterns.responsibility.payRule;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据 时效 规则匹配支付渠道
 * Created by henser on 2017/7/28.
 */
public class PayTimeChannelRule extends PayChannelRule {

    @Override
    public List<PayChannelVO> findPayChannel() {
        System.out.println("根据 时效 开始匹配支付渠道");
        PayChannelVO channelVO_A = new PayChannelVO("时效支付渠道");
        PayChannelVO channelVO_B = new PayChannelVO("时效支付渠道");
        List<PayChannelVO> list = new ArrayList<PayChannelVO>();
        list.add(channelVO_A);
        list.add(channelVO_B);
        return list;
    }

    @Override
    public void setNextPayChannel() {
        nextChannel = new PayLimitChannelRule();
    }

}
