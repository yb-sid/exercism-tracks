package com.ybsid.exercism.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://exercism.org/tracks/java/exercises/resistor-color-duo">...</a>
 */
class ResistorColorDuo {
    private Map<String, Integer> memo;
    public ResistorColorDuo(){
        memo = new HashMap<>();
        var colors = "black,brown,red,orange,yellow,green,blue,violet,grey,white".split(",");
        for(int i=0;i<colors.length;i++){
            memo.put(colors[i],i);
        }
    }
    
    int value(String[] colors) {
        String color1 = colors[0];
        String color2 = colors[1];
        String digit1 = String.valueOf(memo.get(color1.toLowerCase()));
        String digit2 = String.valueOf(memo.get(color2.toLowerCase()));
        return Integer.parseInt(digit1+digit2);
    }
}