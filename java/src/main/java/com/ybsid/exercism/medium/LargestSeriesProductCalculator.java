package com.ybsid.exercism.medium;

import java.util.Arrays;

/**
 * <a href="https://exercism.org/tracks/java/exercises/largest-series-product">...</a>
 */
class LargestSeriesProductCalculator {
    String input;
    LargestSeriesProductCalculator(String inputNumber) {
        if(inputNumber.matches(".*[a-zA-Z]+.*"))
            throw new IllegalArgumentException("String to search may only contain digits.");
        this.input = inputNumber;
    }
    long calculateLargestProductForSeriesLength(int num) {
        if(num==0)
            return 1;
        if(num> input.length())
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if(num<0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        
        int i=0;
        int n = input.length();
        int j = num;
        long ans = 0L;
        while (j <= n) {
            String sub = input.substring(i, j);
            var temp = Arrays.stream(sub.split("")).mapToLong(Integer::parseInt).toArray();
            long tempAns = Arrays.stream(temp).reduce((a, b) -> a * b).orElse(0L);
            ans = Math.max(ans, tempAns);
            i += 1;
            j += 1;
        }
        
        return ans;
    }
}