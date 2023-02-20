package ru.alexsem.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * В методе считываются данные из конфигурационного файла applicationContext.xml
     * (как создать Bean), создаются бины и кладутся в applicationContext.
     * Далее бины из него извлекаются.
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName() + " " + testBean.getAge());
        context.close();
    }
}
