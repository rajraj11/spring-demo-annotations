package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("tennis")
@Scope("singleton")
//@Scope("prototype")
public class TennisCoach implements Coach{

    // Field Injection
    @Autowired
    @Qualifier("sadFortuneService")
    private FortuneService fortuneService1;

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService2;

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService3;

    public TennisCoach() {
        System.out.println("Default Constructor");
    }

    @Override
    public String doSomething() {
        return "Do something : TennisCoach";
    }

    @Override
    public String getDailyFortune() {
        return " Sad : "+fortuneService1.getFortune() +"\n Happy"+ fortuneService2.getFortune()+ "\n Random :"+ fortuneService3.getFortune();
    }

    @PostConstruct
    public void initialization()
    {
        System.out.println("Postconstruct : After Bean Creation");
    }

    @PreDestroy
    public void beforeDestory()
    {
        System.out.println("PostDestroy : Before Bean Destroy");
    }



//    @Autowired
//    public  TennisCoach(FortuneService fortuneService)
//    {
//        System.out.println("Constructor Initialized");
//        this.fortuneService=fortuneService;
//    }



//    setter method

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("setter method");
//        this.fortuneService = fortuneService;
//    }


//    // Method Injectoin
//    @Autowired
//    public void anyMethodName(FortuneService fortuneService)
//    {
//        System.out.println("any Method Name");
//        this.fortuneService=fortuneService;
//    }


}
