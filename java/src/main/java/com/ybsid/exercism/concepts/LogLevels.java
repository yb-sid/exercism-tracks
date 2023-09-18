package com.ybsid.exercism.concepts;

/**
 * <a href="https://exercism.org/tracks/java/exercises/log-levels">...</a>
 */
public class LogLevels {

    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }
    public static String logLevel(String logLine) {
        return logLine.split(":")[0]
                .replace("[","")
                .replace("]","")
                .toLowerCase();
    }
    public static String reformat(String logLine) {
        String[] split = logLine.split(":");
        String msg = split[1].trim();
        String level = split[0].trim().toLowerCase()
                .replace("[","")
                .replace("]","");
        return msg+" (" + level +")";
    }
}
