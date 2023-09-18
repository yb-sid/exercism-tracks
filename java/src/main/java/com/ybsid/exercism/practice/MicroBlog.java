package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/micro-blog">...</a>
 */
class MicroBlog {
    public String truncate(String input) {
        return input.length() <= 5 ? input : input.substring(0,input.offsetByCodePoints(0,5)); 
    }
}