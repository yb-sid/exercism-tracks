package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/darts">...</a>
 */
class Darts {
    int score(double xOfDart, double yOfDart) {
        double z = Math.sqrt(Math.pow(xOfDart,2) + Math.pow(yOfDart,2));
        if(z>10.0){
            return 0;
        }else if (z>5.0 && z<=10.0){
            return 1;
        }else if (z>1.0 && z<=5.0){
            return 5;
        }else{
            return 10;
        }
    }
}