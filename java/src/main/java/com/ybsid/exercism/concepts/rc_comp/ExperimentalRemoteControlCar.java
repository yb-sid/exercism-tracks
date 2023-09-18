package com.ybsid.exercism.concepts.rc_comp;

public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int distance;
    public void drive() {
        distance+=20;
    }
    public int getDistanceTravelled() {
        return distance;
    }
}
