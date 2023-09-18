package com.ybsid.exercism.concepts.rc_comp;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int distance;
    private int numVictories;

    public void drive() {
        distance += 10;
    }
    public int getDistanceTravelled() {
        return distance;
    }
    public int getNumberOfVictories() {
        return numVictories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        numVictories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar compCar) {
        return Integer.compare(compCar.getNumberOfVictories(), getNumberOfVictories());
    }
}
