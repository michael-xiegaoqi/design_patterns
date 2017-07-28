package com.henser.behavioralPatterns.responsibility.payRule;

import java.util.List;

/**
 * 模板方法和责任链方法的结合体
 * Created by henser on 2017/7/28.
 */
public abstract class PayChannelRule {

    public PayChannelRule nextChannel;

    /**
     * 定义流程处理的模板方法
     * @return
     */
    public final PayChannelVO selectPayChannel() {

        //查找匹配的支付渠道
        List<PayChannelVO> list = findPayChannel();

        if(list == null) {
            System.out.println("没有匹配到支付渠道");
            return null;
        }

        if(list.size() == 1) {
            System.out.println("匹配到支付渠道");
            return list.get(0);
        }

        System.out.println("匹配到多个支付渠道");

        //设置下个匹配规则
        setNextPayChannel();

        if(nextChannel == null) {
            System.out.println("没有匹配到支付规则");
            return null;
        }

        return nextChannel.selectPayChannel();

    }

    /**
     * 每个责任需要处理的方法
     * @return
     */
    public abstract List<PayChannelVO> findPayChannel();

    /**
     * 责任链传递到下个责任
     */
    public abstract void setNextPayChannel();

}
