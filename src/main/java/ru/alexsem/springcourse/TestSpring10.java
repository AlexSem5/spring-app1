package ru.alexsem.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring10 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextAnnotation.xml");
//        MusicPlayer10 musicPlayer = context.getBean("musicPlayer10", MusicPlayer10.class);
//        musicPlayer.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
