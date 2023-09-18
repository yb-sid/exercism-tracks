package com.ybsid.exercism.concepts;

/**
 * <a href="https://exercism.org/tracks/java/exercises/bird-watcher">...</a>
 */
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int n = birdsPerDay.length;
        return birdsPerDay[n-1];
    }

    public void incrementTodaysCount() {
        int n = birdsPerDay.length;
        birdsPerDay[n-1] +=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int x : birdsPerDay){
            if(x==0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int l) {
        int count = 0;
        int n = birdsPerDay.length;

        if(n<l)
            l = n;

        for(int i =0 ;i<l ; i++){
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int x : birdsPerDay){
            if(x>=5)
                count+=1;
        }
        return count;
    }
}
