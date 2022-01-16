package org.noXML;

import org.example.Coach;
import org.example.FortuneService;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String doSomething() {
        return "Do swimming";
    }

    @Override
    public String getDailyFortune() {
        return "Swimming Fortune";
    }
}
