package ru.alexsem.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer12 {
//    @Value("${musicPlayer12.name}")
//    private String name;
//    @Value("${musicPlayer12.volume}")
//    private int volume;
    
    @Value("Alex")
    private String name;
    @Value("55")
    private int volume;
    private Music music1;
    private Music music2;
    
    @Autowired
    public MusicPlayer12(@Qualifier("rockMusic") Music music1,
                         @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
    
    @Override
    public String toString() {
        return "MusicPlayer12{" +
               "name='" + name + '\'' +
               ", volume=" + volume +
               ", music1=" + music1 +
               ", music2=" + music2 +
               '}';
    }
}
