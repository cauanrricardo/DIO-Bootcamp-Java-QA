package Interfaces_e_Lambda.MusicPlayer;

public class MusicBox implements  MusicPlayer{
    private final Action stopAction;

    public MusicBox(Action stopAction) {
        this.stopAction = stopAction;
    }

    @Override
    public void playMusic() {
        System.out.println("Music Box do Cauan está reproduzindo: " + MusicPlayer.musicTitle);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music Box do Cauan está pausando a reprodução: " + MusicPlayer.musicTitle);
    }

    @Override
    public void stopMusic() {
        System.out.println("Music Box do Cauan está parando de reproduzir:" + MusicPlayer.musicTitle);
        stopAction.execute();
    }

}
