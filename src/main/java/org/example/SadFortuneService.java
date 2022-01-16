package org.example;

import org.springframework.stereotype.Component;

@Component("sadFortuneService")
public class SadFortuneService implements  FortuneService{
    @Override
    public String getFortune() {
        return "Sad Fortune Service";
    }
}
