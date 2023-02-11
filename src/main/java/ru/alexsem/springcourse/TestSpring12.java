package ru.alexsem.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring12 {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContextAnnotation.xml");
        MusicPlayer12 musicPlayer12 = applicationContext.getBean(
                "musicPlayer12", MusicPlayer12.class);
        System.out.println(musicPlayer12);
        ClassicalMusic classicalMusic1 = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);
        applicationContext.close();
    }
}
