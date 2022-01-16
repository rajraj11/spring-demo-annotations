package org.readPropertiesfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        SwimCoach coach=context.getBean("swimCoach",SwimCoach.class);
        System.out.println(coach.getEmail());
        System.out.println(coach.getName());
    }
}
