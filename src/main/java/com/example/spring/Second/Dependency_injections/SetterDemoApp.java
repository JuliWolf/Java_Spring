package com.example.spring.Second.Dependency_injections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("second_applicationContext.xml");


        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();

    }
}
