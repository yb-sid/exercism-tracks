package com.ybsid.exercism.concepts;

/**
 * <a href="https://exercism.org/tracks/java/exercises/lasagna">...</a>
 */
public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        return this.expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int numLayers) {
        return 2 * numLayers;
    }

    public int totalTimeInMinutes(int numLayers, int numMinutes) {
        return 2 * numLayers + numMinutes;
    }
}
