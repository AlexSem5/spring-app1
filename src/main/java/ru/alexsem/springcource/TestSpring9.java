package ru.alexsem.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring9 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextAnnotation.xml"
        );
        Music music = context.getBean("rockMusicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();;
    }
}
