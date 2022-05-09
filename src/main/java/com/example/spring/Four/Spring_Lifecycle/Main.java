package com.example.spring.Four.Spring_Lifecycle;

import com.example.spring.Two.Dependency_injections.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("four_beanLifecycle.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);


        // close the context
        context.close();
    }
}
