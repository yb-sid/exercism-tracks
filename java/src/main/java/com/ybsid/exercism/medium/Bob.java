package com.ybsid.exercism.medium;

/**
 * <a href="https://exercism.org/tracks/java/exercises/bob">...</a>
 */
class Bob{
    public String hey(String s){
        s = s.strip();
        if (s.isEmpty()) return "Fine. Be that way!";
        boolean isAllCaps = s.matches(".*[A-Z].*") && s.equals(s.toUpperCase());
        boolean isQuestion = s.endsWith("?");
        if (isAllCaps && isQuestion) return "Calm down, I know what I'm doing!";
        if (isAllCaps)               return "Whoa, chill out!";
        if (isQuestion)              return "Sure.";
        return "Whatever.";
    }
}