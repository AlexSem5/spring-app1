package ru.alexsem.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring_lesson6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
        MusicPlayerLesson6 musicPlayer = context.getBean("musicPlayer6", MusicPlayerLesson6.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
