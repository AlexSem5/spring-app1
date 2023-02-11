package ru.alexsem.springcourse;

public class MusicPlayer7 {
    private Music music;
    private String name;
    private int volume;
    
    public void doMyInit() {
        System.out.println("Music Player Initialization");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void setMusic(Music music) {
        this.music = music;
    }
    
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
