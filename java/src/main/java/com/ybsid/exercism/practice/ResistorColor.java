package com.ybsid.exercism.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://exercism.org/tracks/java/exercises/resistor-color">...</a>
 */
class ResistorColor {
    private Map<String, Integer> memo;
    private String[] order;
    public ResistorColor(){
        memo = new HashMap<>();
        var colors = "black,brown,red,orange,yellow,green,blue,violet,grey,white".split(",");
        order = colors;
        for(int i=0;i<colors.length;i++){
            memo.put(colors[i],i);
        }
    }
    int colorCode(String color) {
        return memo.get(color.toLowerCase());
    }
    String[] colors() {
        return order;
    }
}