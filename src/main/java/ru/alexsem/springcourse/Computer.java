package ru.alexsem.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer10 musicPlayer10;
    @Autowired
    public Computer(MusicPlayer10 musicPlayer10) {
        this.id = 1;
        this.musicPlayer10 = musicPlayer10;
    }
    
    @Override
    public String toString() {
        return "Computer{" +
               "id=" + id +
               ", " + musicPlayer10.playMusic() +
               '}';
    }
}
