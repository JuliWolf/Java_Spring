package com.example.spring.First.Inversion_of_Control;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
