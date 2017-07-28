package com.henser.behavioralPatterns.state.scene;

/**
 * Created by henser on 17-7-24.
 */
public class VotClient {

    public static void main(String[] args) {

        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }

}
