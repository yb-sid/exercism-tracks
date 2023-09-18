package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/pig-latin">...</a>
 * \\b is a word boundary assertion that matches the position between a word character and a non-word character.
 * It ensures that the matching occurs at the beginning or end of a word.
 * ([aeiou]+|xr|yt) is a capturing group that matches either a sequence of one or more vowels ([aeiou]+), "xr," or "yt."
 * ([a-z]*) is another capturing group that matches zero or more lowercase letters.
 * $0 in the replacement string represents the entire match (i.e., the matched word).
 * Therefore, the replaceAll method replaces the matched word with the same word ($0) followed by "ay."
 *
 *
 * ([a-z]*qu|[^ aeiouy]+|[^ aeiou]+) is a capturing group that matches one of three options:
 * [a-z]*qu: Matches a sequence of zero or more lowercase letters followed by "qu."
 * [^ aeiouy]+: Matches one or more consecutive non-vowel, non-space characters.
 * [^ aeiou]+: Matches one or more consecutive non-vowel, non-space characters (excluding "y").
 * (y?[a-z]+) is another capturing group that matches a word starting with an optional "y"
 * followed by one or more lowercase letters.
 * (?<!ay) is a negative lookbehind assertion that ensures the word does not end with "ay."
 * This prevents already translated words from being re-translated.
 * $2$1ay in the replacement string rearranges the word. $2 represents the contents of the second capturing group,
 * $1 represents the contents of the first capturing group, and "ay" is appended at the end.
 * Therefore, the replaceAll method replaces the matched word with the rearranged form.
 */
public class PigLatin {
    String translate(String text) {
        return text
                .replaceAll("\\b([aeiou]+|xr|yt)([a-z]*)\\b", "$0ay")
                .replaceAll("\\b([a-z]*qu|[^ aeiouy]+|[^ aeiou]+)(y?[a-z]+)(?<!ay)\\b", "$2$1ay");
    }
}
