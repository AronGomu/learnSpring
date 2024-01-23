package com.example.learnspring.leetcode;

import lombok.extern.log4j.Log4j2;

import java.util.*;
import java.util.stream.Collectors;

@Log4j2
public class ZigZagConversion6 {

    public boolean testCases() {
        boolean hasTestFailed = false;

        String test1 = this.convert("PAYPALISHIRING", 3);
        if (!test1.equals("PAHNAPLSIIGYIR")) {
            log.error("TEST 1 FAILED : PAHNAPLSIIGYIR != " + test1);
            hasTestFailed = true;
            }

        String test2 = this.convert("PAYPALISHIRING", 4);
        if (!test2.equals("PINALSIGYAHRPI")) {
            log.error("TEST 2 FAILED : PINALSIGYAHRPI != " + test2);
            hasTestFailed = true;
            }

        String test3 = this.convert("A", 1);
        if (!test3.equals("A")) {
            log.error("TEST 3 FAILED : A != " + test3);
            hasTestFailed = true;
            }

        return hasTestFailed;
    }
    public String convert(String s, int numRows) {

        List<String> rows = new ArrayList<>(Collections.nCopies(numRows, ""));
        int rowToAdd = 0;
        int indexS = 0;

        while (true) {

            rows.set(rowToAdd, rows.get(rowToAdd).concat(String.valueOf(s.charAt(indexS))));

            indexS+=1;
            if (indexS >= s.length()) break;

            rowToAdd+=1;
            if (rowToAdd == numRows) rowToAdd = 0;
       }

        return String.join("", rows);
    }
}
