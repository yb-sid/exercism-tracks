package com.ybsid.exercism.concepts;

/**
 * <a href="https://exercism.org/tracks/java/exercises/need-for-speed">...</a>
 */
class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int BATTERY = 100;
    private int distance = 0;
    public NeedForSpeed(int speed , int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        if(BATTERY<batteryDrain)
            return true;
        return false;
    }
    public int distanceDriven() {
        return this.distance;
    }
    public void drive() {
        if(!batteryDrained()){
            distance+= speed;
            BATTERY -= batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}
class RaceTrack {
    private final int trackDistance;
    public RaceTrack(int distance){
        this.trackDistance = distance;
    }
    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        if(car.distanceDriven()>=trackDistance){
            return true;
        }
        return false;
    }
}
