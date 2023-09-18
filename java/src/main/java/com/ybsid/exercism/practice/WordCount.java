package com.ybsid.exercism.practice;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

/**
 * <a href="https://exercism.org/tracks/java/exercises/word-count">...</a>
 */
class WordCount {
    public Map<String, Integer> phrase(String input) {
        return Arrays.stream(input.toLowerCase().split("[,\\s]"))
                .map(w -> w.replaceAll("[^a-z0-9']|^'|'$", ""))
                .filter(w -> w.length() > 0)
                .collect(groupingBy(s -> s, summingInt($ -> 1)));
    }
}
