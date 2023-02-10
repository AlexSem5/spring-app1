package ru.alexsem.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer10 {
    private Music music;
    
    //    This annotation selects appropriate beans
//    by their type (either class or interface)
//    to perform DI
    @Autowired
    public MusicPlayer10(Music music) {
        this.music = music;
    }
    
    public String playMusic() {
        return "Playing: " + music.getSong();
    }
}
