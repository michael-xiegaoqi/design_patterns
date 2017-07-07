package main.java.behavioralPatterns.command.scene;

/**
 * Created by henser on 17-7-4.
 */
public class PlayCommand implements Command{

    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }

}
