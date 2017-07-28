package com.henser.behavioralPatterns.state.scene;

/**
 * 具体状态类——黑名单
 * Created by henser on 17-7-24.
 */
public class BlackVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }

}
