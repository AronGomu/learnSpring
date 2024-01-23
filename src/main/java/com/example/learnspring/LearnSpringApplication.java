package com.example.learnspring;

import com.example.learnspring.leetcode.ZigZagConversion6;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@Log4j2
@SpringBootApplication
@EnableAsync
public class LearnSpringApplication {


    public static void main(String[] args) {

//        ZigZagConversion6 zigZagConversion6 = new ZigZagConversion6();
//        zigZagConversion6.testCases();
        SpringApplication.run(LearnSpringApplication.class, args);

    }


}
