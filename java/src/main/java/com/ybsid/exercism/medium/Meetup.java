package com.ybsid.exercism.medium;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;

/**
 * <a href="https://exercism.org/tracks/java/exercises/meetup">...</a>
 */
class Meetup {
    private final int month;
    private final int year;
    Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }
    LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule schedule) {
        //A 'teenth' date must be a day of the week between the 13th and the 19th.
        //We start looking for the desired day starting from the 13th
        //For every other case than 'TEENTH', the actual value of the day is irrelevant.
        final LocalDate meetingDate = LocalDate.of(year, month, 13);
        switch (schedule) {
            case FIRST:
                return meetingDate.with(firstInMonth(dayOfWeek));
            case SECOND:
                return meetingDate.with(dayOfWeekInMonth(2, dayOfWeek));
            case THIRD:
                return meetingDate.with(dayOfWeekInMonth(3, dayOfWeek));
            case FOURTH:
                return meetingDate.with(dayOfWeekInMonth(4, dayOfWeek));
            case LAST:
                return meetingDate.with(lastInMonth(dayOfWeek));
            case TEENTH:
                return meetingDate.with(nextOrSame(dayOfWeek));
            default:
                throw new IllegalStateException("should not reach here");
        }
    }
}

enum MeetupSchedule {
    FIRST,
    SECOND,
    THIRD,
    FOURTH,
    LAST,
    TEENTH
}