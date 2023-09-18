package com.ybsid.exercism.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://exercism.org/tracks/java/exercises/nucleotide-count">...</a>
 */
class NucleotideCounter {
    private static Map<Character, Integer> counter = new HashMap<>();
    private boolean emptyInput = false;
    private Set<Character> genes = Set.of('A', 'C', 'G', 'T');

    public NucleotideCounter(String seq) {
        if (seq.isEmpty()) {
            emptyInput = true;
        } else {
            genes.forEach(e -> counter.put(e, 0));
            initMap(seq);
        }
    }

    private void initMap(String seq) {
        for (char c : seq.toCharArray()) {
            if (!genes.contains(c)) {
                throw new IllegalArgumentException("bad input");
            }
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        if (emptyInput) {
            return Map.of('A', 0, 'C', 0, 'G', 0, 'T', 0);
        }
        return counter;
    }
}