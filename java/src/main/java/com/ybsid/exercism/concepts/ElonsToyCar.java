package com.ybsid.exercism.concepts;

/**
 * <a href="https://exercism.org/tracks/java/exercises/elons-toy-car">...</a>
 */
public class ElonsToyCar {
    private int BATTERY_PERCENT = 100;
    private int DRIVEN = 0;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return "Driven "+DRIVEN+" meters";
    }
    public String batteryDisplay() {
        if(BATTERY_PERCENT==0){
            return "Battery empty";
        }
        return "Battery at "+BATTERY_PERCENT+"%";
    }
    public void drive() {
        if(BATTERY_PERCENT==0){
            return;
        }
        DRIVEN+= 20;
        BATTERY_PERCENT-=1;
    }
}
