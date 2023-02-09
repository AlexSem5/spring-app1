package ru.alexsem.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext7.xml"
        );
//        MusicPlayer7 secondMusicPlayer = context.getBean("musicPlayer7", MusicPlayer7.class);
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        firstMusicPlayer.setVolume(70);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic1.getSong());
//        System.out.println(classicalMusic2.getSong());
        MusicPlayer7 firstMusicPlayer = context.getBean("musicPlayer7", MusicPlayer7.class);
        firstMusicPlayer.playMusic();
        System.out.println(firstMusicPlayer.getName());
        context.close();
    }
}
