package com.example.learnspring.leetcode;

import lombok.extern.log4j.Log4j2;

import java.util.stream.Collectors;

@Log4j2
public class Leet8StringToInteger {
    public boolean testCases() {
        boolean hasTestFailed = false;


        int test1 = this.atoi("42");
        if (test1 != 42) {
            log.error("TEST 1 FAILED : 42 != " + test1);
            hasTestFailed = true;
        }

        int test2 = this.atoi("     -42");
        if (test2 != -42) {
            log.error("TEST 2 FAILED : -42 != " + test2);
            hasTestFailed = true;
        }

        int test3 = this.atoi("4193 with words");
        if (test3 != 4193) {
            log.error("TEST 3 FAILED : 4193 != " + test3);
            hasTestFailed = true;
        }

        return hasTestFailed;
    }
    public int atoi(String s) {
        String filtered = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> Character.isDigit(c) || c == '+' || c == '-')
                .collect(Collectors.toList())
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        return Integer.parseInt(filtered);
    }
}
