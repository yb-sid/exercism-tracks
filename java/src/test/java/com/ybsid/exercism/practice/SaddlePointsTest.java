package com.ybsid.exercism.practice;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SaddlePointsTest {

    @Test
    public void testCanIdentifySingleSaddlePoint() {
        SaddlePoints matrix = new SaddlePoints(Arrays.asList(
                Arrays.asList(9, 8, 7),
                Arrays.asList(5, 3, 2),
                Arrays.asList(6, 6, 7)
        ));

        Set<SaddlePointsCoordinate> expectedSaddlePoints = Collections.singleton(new SaddlePointsCoordinate(2, 1));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    
    @Test
    public void testCanIdentifyThatEmptySaddlePointsHasNoSaddlePoints() {
        SaddlePoints matrix = new SaddlePoints(new ArrayList<>());

        Set<SaddlePointsCoordinate> expectedSaddlePoints = Collections.emptySet();

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    
    @Test
    public void testCanIdentifyLackOfSaddlePointsWhenThereAreNone() {
        SaddlePoints matrix = new SaddlePoints(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 1, 2),
                Arrays.asList(2, 3, 1)
        ));

        Set<SaddlePointsCoordinate> expectedSaddlePoints = Collections.emptySet();

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    
    @Test
    public void testCanIdentifyMultipleSaddlePointsInAColumn() {
        SaddlePoints matrix = new SaddlePoints(Arrays.asList(
                Arrays.asList(4, 5, 4),
                Arrays.asList(3, 5, 5),
                Arrays.asList(1, 5, 4)
        ));

        Set<SaddlePointsCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new SaddlePointsCoordinate(1, 2),
                new SaddlePointsCoordinate(2, 2),
                new SaddlePointsCoordinate(3, 2)
        ));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    
    @Test
    public void testCanIdentifyMultipleSaddlePointsInARow() {
        SaddlePoints matrix = new SaddlePoints(Arrays.asList(
                Arrays.asList(6, 7, 8),
                Arrays.asList(5, 5, 5),
                Arrays.asList(7, 5, 6)
        ));

        Set<SaddlePointsCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new SaddlePointsCoordinate(2, 1),
                new SaddlePointsCoordinate(2, 2),
                new SaddlePointsCoordinate(2, 3)
        ));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    
    @Test
    public void testCanIdentifySaddlePointInBottomRightCorner() {
        SaddlePoints matrix = new SaddlePoints(Arrays.asList(
                Arrays.asList(8, 7, 9),
                Arrays.asList(6, 7, 6),
                Arrays.asList(3, 2, 5)
        ));

        Set<SaddlePointsCoordinate> expectedSaddlePoints = Collections.singleton(new SaddlePointsCoordinate(3, 3));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    
    @Test
    public void testCanIdentifySaddlePointsInANonSquareSaddlePoints() {
        SaddlePoints matrix = new SaddlePoints(Arrays.asList(
                Arrays.asList(3, 1, 3),
                Arrays.asList(3, 2, 4)
        ));

        Set<SaddlePointsCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new SaddlePointsCoordinate(1, 3),
                new SaddlePointsCoordinate(1, 1)
        ));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    
    @Test
    public void testCanIdentifyThatSaddlePointsInASingleColumnSaddlePointsAreThoseWithMinimumValue() {
        SaddlePoints matrix = new SaddlePoints(Arrays.asList(
                Collections.singletonList(2),
                Collections.singletonList(1),
                Collections.singletonList(4),
                Collections.singletonList(1)
        ));

        Set<SaddlePointsCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new SaddlePointsCoordinate(2, 1),
                new SaddlePointsCoordinate(4, 1)
        ));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    
    @Test
    public void testCanIdentifyThatSaddlePointsInASingleRowSaddlePointsAreThoseWithMaximumValue() {
        SaddlePoints matrix = new SaddlePoints(Arrays.asList(
                Arrays.asList(2, 5, 3, 5)
        ));

        Set<SaddlePointsCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new SaddlePointsCoordinate(1, 2),
                new SaddlePointsCoordinate(1, 4)
        ));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

}