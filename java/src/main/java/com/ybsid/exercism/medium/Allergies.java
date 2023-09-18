package com.ybsid.exercism.medium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://exercism.org/tracks/java/exercises/allergies">...</a>
 */
public class Allergies{
    private final int score;
    public Allergies(int score){
        this.score = score;
    }
    public boolean isAllergicTo(Allergen type){
        return (type.getScore() & score) !=0;
    }
    public List<Allergen> getList(){
        return Arrays.stream(Allergen.values())
                .filter(this::isAllergicTo)
                .collect(Collectors.toList());
    }
}

enum Allergen {
    EGGS(1),
    PEANUTS(2),
    SHELLFISH(4),
    STRAWBERRIES(8),
    TOMATOES(16),
    CHOCOLATE(32),
    POLLEN(64),
    CATS(128);
    private final int score;
    Allergen(int score) {
        this.score = score;
    }
    int getScore() {
        return score;
    }
}
