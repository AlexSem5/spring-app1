package ru.alexsem.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer10 {
    //    Fields annotations can only be used provided
//    there is a no-arg constructor exists
//    Внедрение двух бинов через поле:
//    @Autowired
//    @Qualifier("rockMusic")
    private Music music1;
    
//    @Autowired
//    @Qualifier("classicalMusic")
    private Music music2;
    
    
    //    This annotation selects appropriate beans
//    by their type (either class or interface)
//    to perform DI
//    @Autowired
//    public MusicPlayer10(@Qualifier("rockMusic") Music music1,
//                         @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

//    Название метода может быть любым,
//    необязательно setter
    @Autowired
    @Qualifier("classicalMusic")
    public void setMusic1(Music music1) {
        this.music1 = music1;
    }
    @Autowired
    @Qualifier("rockMusic")
    public void setMusic2(Music music2) {
        this.music2 = music2;
    }
    
    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
