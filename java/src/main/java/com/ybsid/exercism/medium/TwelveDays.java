package com.ybsid.exercism.medium;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://exercism.org/tracks/java/exercises/twelve-days">...</a>
 */
class TwelveDays {
    private final String[] dayCount = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    private final String[] replace = {"a Partridge in a Pear Tree", "two Turtle Doves",
                                "three French Hens", "four Calling Birds", "five Gold Rings",
                                "six Geese-a-Laying", "seven Swans-a-Swimming",
                                "eight Maids-a-Milking",
                                "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping",
                                "twelve Drummers Drumming"};

    String verse(int verseNumber) {
        String verse;
        if (1 < verseNumber) {
            verse = IntStream.iterate(verseNumber - 1, e -> e - 1).limit(verseNumber - 1)
                    .mapToObj(i -> replace[i] + ", ")
                    .collect(Collectors.joining(""));
            verse = verse + "and " + replace[0];
        } else {
            verse = replace[0];
        }
        String commonText = "On the %s day of Christmas my true love gave to me: ";
        return String.format(commonText, dayCount[verseNumber - 1]) + verse + ".\n";
    }
    String verses(int startVerse, int endVerse) {
        String verses = IntStream.rangeClosed(startVerse, endVerse)
                .mapToObj(i -> verse(i) + "\n")
                .collect(Collectors.joining(""));
        return verses.substring(0, verses.length() - 1);
    }
    
    String sing() {
        return verses(1,12);   
    }
}