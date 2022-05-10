package com.example.spring.Seven.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example.spring.Seven.Configuration")
public class SportConfig {
    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService () {
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach () {
        return new SwimCoach(sadFortuneService());
    }
}
