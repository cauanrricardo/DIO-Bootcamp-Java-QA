package Interfaces_e_Lambda.MusicPlayer;

public class Smartphone implements  VideoPlayer{
    @Override
    public void playVideo() {
        System.out.println("S20 está tocando video: " + VideoPlayer.videoTitle);
    }

    @Override
    public void pauseVideo() {
        System.out.println("S20 está pausando o video: "+ VideoPlayer.videoTitle);
    }

    @Override
    public void stopVideo() {
        System.out.println("S20 está parando o video: "+ VideoPlayer.videoTitle);
    }
}
