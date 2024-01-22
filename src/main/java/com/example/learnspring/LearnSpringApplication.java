package com.example.learnspring;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class LearnSpringApplication {


    public static void main(String[] args) {

        log.info("Application is starting");

        SpringApplication.run(LearnSpringApplication.class, args);

        log.info("Application has started.");

    }


}
