package org.noXML;

import org.example.Coach;
import org.example.FortuneService;
import org.example.HappyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class SportConfig {

    @Bean
    public FortuneService happyFortueneService()
    {
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimCoachbean()
    {
        SwimCoach myswimCoach=new SwimCoach(happyFortueneService());
        return myswimCoach;
    }
}
