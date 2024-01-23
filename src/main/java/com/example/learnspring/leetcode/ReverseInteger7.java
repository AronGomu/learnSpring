package com.example.learnspring.leetcode;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class ReverseInteger7 {
    public boolean testCases() {
        boolean hasTestFailed = false;

        int test1 = this.reverse(123);
        int expectedResult1 = 321;
        if (test1 != expectedResult1) {
            log.error("TEST 1 FAILED : " + expectedResult1 + " != " + test1);
            hasTestFailed = true;
        }

        int test2 = this.reverse(-123);
        int expectedResult2 = -321;
        if (test2 != expectedResult2) {
            log.error("TEST 2 FAILED : " + expectedResult2 + " != " + test2);
            hasTestFailed = true;
        }

        int test3 = this.reverse(120);
        int expectedResult3 = 21;
        if (test3 != expectedResult3) {
            log.error("TEST 3 FAILED : " + expectedResult3 + " != " + test3);
            hasTestFailed = true;
        }

        return hasTestFailed;
    }
    public int reverse(int x) {
        String s = Integer.toString(x);

        String reversed;
        if (s.charAt(0) == '-') {

            reversed = '-' + new StringBuilder(s.substring(1))
                    .reverse()
                    .toString();
        } else {

            reversed = new StringBuilder(s)
                    .reverse()
                    .toString();
        }

        try {
            return Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }


    }
}
