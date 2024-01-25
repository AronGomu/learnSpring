package com.example.learnspring.leetcode;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Leet9PalindromeNumber {
    public boolean testCases() {
        boolean hasTestFailed = false;

        int input1 = 121;
        boolean test1 = this.isPalindrome(input1);
        if (test1 != true) {
            log.error("TEST 1 FAILED : true != " + test1);
            hasTestFailed = true;
        }

        int input2 = -121;
        boolean test2 = this.isPalindrome(input2);
        if (test2 != false) {
            log.error("TEST 2 FAILED : false != " + test2);
            hasTestFailed = true;
        }

        int input3 = 10;
        boolean test3 = this.isPalindrome(input3);
        if (test3 != false) {
            log.error("TEST 3 FAILED : false != " + test3);
            hasTestFailed = true;
        }


        return hasTestFailed;
    }

    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);

        int startI = 0;
        int endI = s.length() - 1;

        while (true) {

            if (startI >= endI) break;

            if (s.charAt(startI) != s.charAt(endI)) {
                return false;
            }

            startI++;
            endI--;

        }
        return true;
    }
}
