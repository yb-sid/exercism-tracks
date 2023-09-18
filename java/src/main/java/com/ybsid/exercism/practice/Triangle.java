package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/triangle">...</a>
 */
public class Triangle {
    double side1;
    double side2;
    double side3;
    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if(side1 ==0 || side2 ==0 || side3 == 0) throw new TriangleException();
        if(side1+side2<side3 || side2+side3<side1 || side1+side3<side2 )
            throw new TriangleException();
    }
    boolean isEquilateral() {
        return side1==side2 && side2==side3;
    }
    boolean isIsosceles() {
        return (side1 == side2 && side2 != side3) || (side1 == side3 && side3 != side2)
                || (side2 == side3 && side3 != side1) || isEquilateral();
    }
    boolean isScalene() {
        return !isIsosceles() && (side1+side2 >= side3 && side1+side3 >= side2 && side2+side3 >= side1);
    }
}

class TriangleException extends Exception {
}