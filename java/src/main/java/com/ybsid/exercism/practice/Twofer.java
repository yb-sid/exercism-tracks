package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/two-fer">...</a>
 */
public class Twofer {
    public String twofer(String name) {
        if(name==null || name.isEmpty())
            return "One for you, one for me.";
        else
            return "One for " + name + ", one for me.";
    }
}
