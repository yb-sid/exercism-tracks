package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/difference-of-squares">...</a>
 */
class DifferenceOfSquaresCalculator {
    int computeSquareOfSumTo(int n) {
        int sum = (n * (n+1))/2;
        return sum*sum;
    }
    int computeSumOfSquaresTo(int n) {
        return (n*(n+1)*(2*n+1))/6;
    }
    int computeDifferenceOfSquares(int n) {
        return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
    }
}
