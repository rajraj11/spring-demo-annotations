package org.noXML;

import org.example.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach=context.getBean("tennis",Coach.class);
        System.out.println("From javaConfigDemo "+coach.doSomething());

        Coach swimCoach=context.getBean("swimCoachbean",Coach.class);
        System.out.println(swimCoach.doSomething());
        System.out.println(swimCoach.getDailyFortune());

    }
}
