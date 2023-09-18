package com.ybsid.exercism.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://exercism.org/tracks/java/exercises/isogram">...</a>
 */
public class IsogramChecker {
    
    boolean isIsogram(String phrase) {
        Set<Character> memo = new HashSet<>();
        for(char c : phrase.toCharArray()){
            if(Character.isLetter(c) && memo.contains(Character.toLowerCase(c)))
                return false;
            else
                memo.add(Character.toLowerCase(c));
        }
        return true;
    }
}