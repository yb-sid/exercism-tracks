package com.ybsid.exercism.concepts.rc_comp;

import java.util.List;
import java.util.Collections;
public class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }
    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> rankCars) {
        Collections.sort(rankCars);
        return rankCars;

    }
}
