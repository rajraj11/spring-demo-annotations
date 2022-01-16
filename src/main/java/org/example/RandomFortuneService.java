package org.example;

import org.springframework.stereotype.Component;

@Component("randomFortuneService")
public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Random Fortune Service";
    }
}
