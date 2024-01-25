package com.example.learnspring;

import com.example.learnspring.leetcode.Leet8StringToInteger;
import com.example.learnspring.leetcode.Leet9PalindromeNumber;
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

//        Leet8StringToInteger leet8StringToInteger = new Leet8StringToInteger();
//        leet8StringToInteger.testCases();
        Leet9PalindromeNumber leet9PalindromeNumber = new Leet9PalindromeNumber();
        leet9PalindromeNumber.testCases();
//        SpringApplication.run(LearnSpringApplication.class, args);

    }


}
