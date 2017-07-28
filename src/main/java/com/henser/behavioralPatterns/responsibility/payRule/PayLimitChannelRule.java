package com.henser.behavioralPatterns.responsibility.payRule;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据 额度 规则匹配支付渠道
 * Created by henser on 2017/7/28.
 */
public class PayLimitChannelRule extends PayChannelRule {

    @Override
    public List<PayChannelVO> findPayChannel() {
        System.out.println("根据 额度 开始匹配支付渠道");
        PayChannelVO channelVO_A = new PayChannelVO("额度支付渠道");
        List<PayChannelVO> list = new ArrayList <PayChannelVO>();
        list.add(channelVO_A);
        return list;
    }

    @Override
    public void setNextPayChannel() {
        nextChannel = null;
    }
}
