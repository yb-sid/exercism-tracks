package com.ybsid.exercism.concepts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LasagnaTests {

    @Test
    public void total_time_in_minutes_for_multiple_layers() {
        assertEquals(new Lasagna().totalTimeInMinutes(4, 8), 16);
    }

    @Test
    public void total_time_in_minutes_for_one_layer() {
        assertEquals(new Lasagna().totalTimeInMinutes(1, 30), 32);
    }

    @Test
    public void remaining_minutes_in_oven() {
        assertEquals(new Lasagna().remainingMinutesInOven(25), 15);
    }

    @Test
    public void preparation_time_in_minutes_for_one_layer() {
        assertEquals(new Lasagna().preparationTimeInMinutes(1), 2);
    }

    @Test
    public void expected_minutes_in_oven() {
        assertEquals(new Lasagna().expectedMinutesInOven(), 40);
    }

    @Test
    public void preparation_time_in_minutes_for_multiple_layers() {
        assertEquals(new Lasagna().preparationTimeInMinutes(4), 8);
    }


}


