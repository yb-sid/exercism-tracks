package com.ybsid.exercism.practice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://exercism.org/tracks/java/exercises/robot-name">...</a>
 */
public class Robot {
    private static final Set<String> registeredNames = new HashSet<>();
    private static final Random random = new Random();
    private String name;
    public Robot() {
        reset();
    }
    public String getName() {
        return name;
    }
    public void reset() {
        registeredNames.remove(this.name);
        String name;
        while (registeredNames.contains(name = generateName())) {
            continue;
        }
        registeredNames.add(name);
        this.name = name;
    }
    private static String randomString(char fromChar, char toChar, int len) {
        return random.ints(fromChar, toChar + 1).limit(len)
                .mapToObj(ch -> Character.toString((char)ch))
                .collect(Collectors.joining());
    }
    private static String generateName() {
        return randomString('A', 'Z', 2) + randomString('0', '9', 3);
    }
}
