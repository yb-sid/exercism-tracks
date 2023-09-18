package com.ybsid.exercism.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <a href="https://exercism.org/tracks/java/exercises/flatten-array">...</a>
 */
class Flattener{
    public static List<Object> flatten(List<Object> input){
        return input.stream()
                .flatMap(e -> e instanceof List ?
                        Flattener.flatten((List<Object>) e).stream() : Stream.of(e))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}

