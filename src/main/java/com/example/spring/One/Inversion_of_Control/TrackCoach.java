package com.example.spring.One.Inversion_of_Control;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
