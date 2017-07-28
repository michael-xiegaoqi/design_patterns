package com.henser.behavioralPatterns.command.scene;

/**
 * Created by henser on 17-7-4.
 */
public class StopCommand implements Command {

    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.stop();
    }

}
