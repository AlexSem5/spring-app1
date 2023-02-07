package ru.alexsem.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring_homework {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
        MusicPlayerHomework musicPlayer = context.getBean("musicPlayerHomework", MusicPlayerHomework.class);
        musicPlayer.playMusic();
        context.close();
    }
}
