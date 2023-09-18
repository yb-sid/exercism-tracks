package com.ybsid.exercism.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://exercism.org/tracks/java/exercises/series">...</a>
 */
class Series {
    private String word;
    Series(String string) {
        this.word = string;
    }
    List<String> slices(int num) {
        if(num<=0)
            throw new IllegalArgumentException("Slice size is too small.");
        if(num>word.length())
            throw new IllegalArgumentException("Slice size is too big.");
        List<String> answer = new ArrayList<>();
        int i=0,j=num-1;
        int n = word.length();
        while(j<n){
            String curr = word.substring(i,j+1);
            answer.add(curr);
            i+=1;
            j+=1;
        }
        return answer;
    }
}