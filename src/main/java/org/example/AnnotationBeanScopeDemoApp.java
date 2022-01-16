package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach1=context.getBean("tennis",Coach.class);
        Coach coach2=context.getBean("tennis",Coach.class);
        if(coach1==coach2)
        {
            System.out.println("Equal : singleton");
            System.out.println(coach1);
        }
        else {
            System.out.println("Different : prototype");
            System.out.println(coach1 +"  "+coach2);
        }
        context.close();
    }
}
