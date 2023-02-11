package ru.alexsem.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayerHomework {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void playMusic() {
        musicList.forEach(music -> System.out.println("Playing: " + music.getSong()));
    }
}
