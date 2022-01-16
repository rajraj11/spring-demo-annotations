package org.readPropertiesfile;

import org.example.Coach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("swimCoach")

public class SwimCoach implements Coach {

    @Override
    public String doSomething() {
        return "swim: do something";
    }

    @Override
    public String getDailyFortune() {
        return "swim: fortune";
    }
    @Value("${foo.email}")
    private String email;

    @Value("${foo.name}")
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
