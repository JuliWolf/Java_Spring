package com.example.spring.Second.Dependency_injections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("second_applicationContext.xml");


        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // let's call our new method for fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
