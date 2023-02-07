package ru.alexsem.springcource;

public class MusicPlayer {
    private Music music;
    
//    Implementation of Ioc
    
    public MusicPlayer(Music music) {
        this.music = music;
    }
    
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
