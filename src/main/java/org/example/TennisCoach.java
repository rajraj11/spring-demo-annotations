package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennis")
public class TennisCoach implements Coach{


    private FortuneService fortuneService;

    @Autowired
    public  TennisCoach(FortuneService fortuneService)
    {
        System.out.println("Constructor Initialized");
        this.fortuneService=fortuneService;
    }
    @Override
    public String doSomething() {
        return "Do something : TennisCoach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
