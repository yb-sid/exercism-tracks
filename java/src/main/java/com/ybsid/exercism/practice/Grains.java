package com.ybsid.exercism.practice;

import java.math.BigInteger;

/**
 * <a href="https://exercism.org/tracks/java/exercises/grains">...</a>
 */
class Grains {
    BigInteger grainsOnSquare(final int square) {
        if(square>64 || square<=0)
            throw new IllegalArgumentException("square must be between 1 and 64");
        if(square==1)
            return BigInteger.ONE;
        return BigInteger.TWO.multiply(grainsOnSquare(square-1));
    }
    BigInteger grainsOnBoard() {
        BigInteger sum = BigInteger.ZERO;
        for(int i=1;i<=64;i++){
            sum = sum.add(grainsOnSquare(i));
        }
        return sum;
    }
}
