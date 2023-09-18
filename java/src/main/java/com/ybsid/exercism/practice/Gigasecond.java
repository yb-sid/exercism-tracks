package com.ybsid.exercism.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class Gigasecond {
    LocalDateTime date;
    public Gigasecond(LocalDate moment) {
        date = moment.atTime(0,0);
    }
    public Gigasecond(LocalDateTime moment) {
        date = moment;
    }
    public LocalDateTime getDateTime() {
        return date.plusSeconds(1_000_000_000L);
    }
}
