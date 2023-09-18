package com.ybsid.exercism.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://exercism.org/tracks/java/exercises/scrabble-score">...</a>
 */
class Scrabble {
    Map<Character,Integer> memo ;
    String word ;
    Scrabble(String word) {
        memo = new HashMap<>();
        buildMemo(memo);
        this.word = word;
    }
    private void buildMemo(Map<Character, Integer> memo) {
        Arrays.stream("AEIOULNRST".split("")).forEach(e -> memo.put(e.charAt(0),1));
        Arrays.stream("DG".split("")).forEach(e -> memo.put(e.charAt(0),2));
        Arrays.stream("BCMP".split("")).forEach(e -> memo.put(e.charAt(0),3));
        Arrays.stream("FHVWY".split("")).forEach(e -> memo.put(e.charAt(0),4));
        Arrays.stream("K".split("")).forEach(e -> memo.put(e.charAt(0),5));
        Arrays.stream("JX".split("")).forEach(e -> memo.put(e.charAt(0),8));
        Arrays.stream("QZ".split("")).forEach(e -> memo.put(e.charAt(0),10));
    }
    int getScore() {
        int sum = 0;
        for(char c : word.toCharArray()){
            sum += memo.get(Character.toUpperCase(c));
        }
        return sum;
    }
}
