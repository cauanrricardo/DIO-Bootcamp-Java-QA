package Interfaces_e_Lambda.MusicPlayer;

public class Main {
    public static void main(String[] args) {
    MusicBox box = new MusicBox(
            () -> System.out.println("Lambda: Music Box do Cauan está parando: " + MusicPlayer.musicTitle)
    );
    box.playMusic();
    box.pauseMusic();
    box.stopMusic(); //lambda

    }
}