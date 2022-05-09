package com.example.spring.Two.Dependency_injections;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
