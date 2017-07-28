package com.henser.behavioralPatterns.state.scene;

/**
 * 具体状态类——重复投票
 * Created by henser on 17-7-24.
 */
public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }

}
