package ru.alexsem.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring13 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer12 musicPlayer = context.getBean("musicPlayer12", MusicPlayer12.class);
        System.out.println(musicPlayer);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);
        context.close();
        
    }
    
}
