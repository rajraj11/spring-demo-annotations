package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach=context.getBean("tennis",Coach.class);
        System.out.println(coach.doSomething());
        System.out.println(coach.getDailyFortune());
        context.close();

    }
}
