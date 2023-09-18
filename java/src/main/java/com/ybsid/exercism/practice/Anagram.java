package com.ybsid.exercism.practice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://exercism.org/tracks/java/exercises/anagram">...</a>
 */
class Anagram{
    private String word;
    private Map<Character , Integer> counter;
    public Anagram(String word){
        this.word = word;
        this.counter = new HashMap<>();
        preCompute(this.word);
    }
    private void preCompute(String word){
        Arrays.stream(word.split(""))
                .forEach(e-> counter.put(Character.toLowerCase(e.charAt(0)),
                        counter.getOrDefault(e.charAt(0),0)+1));
    }
    public List<String> match(List<String> inputs){
        return inputs.stream().filter(this::checkAnagram).collect(Collectors.toList());
    }
    private boolean checkAnagram(String curr){
        if(curr.equalsIgnoreCase(word))
            return false;
        Map<Character,Integer> copy = new HashMap<>(this.counter);
        for(char c : curr.toCharArray()){
            char x  = Character.toLowerCase(c);
            if(!copy.containsKey(x)){
                return false;
            }else{
                copy.put(x , copy.get(x)-1);
                if(copy.get(x)==0){
                    copy.remove(x);
                }
            }
        }
        return copy.isEmpty();
    }
}
