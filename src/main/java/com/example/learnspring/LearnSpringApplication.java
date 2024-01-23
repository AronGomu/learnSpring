package com.example.learnspring;

import com.example.learnspring.leetcode.ReverseInteger7;
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

        ReverseInteger7 reverseInteger7 = new ReverseInteger7();
        reverseInteger7.testCases();
//        SpringApplication.run(LearnSpringApplication.class, args);

    }


}
