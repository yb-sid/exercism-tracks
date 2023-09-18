package com.ybsid.exercism.medium;

import java.util.*;

/**
 * <a href="https://exercism.org/tracks/java/exercises/high-scores">...</a>
 */
public class HighScores {
    List<Integer> scores;
    public HighScores(List<Integer> highScores) {
        this.scores = new ArrayList<>(highScores);
    }
    List<Integer> scores() {
        return this.scores;
    }
    Integer latest() {
        return scores.get(scores.size()-1);
    }
    Integer personalBest() {
        return scores.stream().mapToInt(e->e).max().orElse(0);
    }
    List<Integer> personalTopThree() {
        if(scores.size()==1)
            return scores;
        if(scores.size()==2){
            return Arrays.asList(Math.max(scores.get(0),scores.get(1)) , Math.min(scores.get(0),scores.get(1)));
        }
       List<Integer> copy = new ArrayList<>(scores);
       copy.sort((a,b)-> b-a);
       
       return copy.subList(0,3);
       
    }
}