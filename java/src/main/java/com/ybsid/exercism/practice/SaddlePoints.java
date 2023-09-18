package com.ybsid.exercism.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://exercism.org/tracks/java/exercises/saddle-points/mentor_discussions">...</a>
 */
public class SaddlePoints {

    private final int numRows;
    private final int numCols;
    int[] rowsMax;
    int[] colsMin;
    SaddlePoints(List<List<Integer>> values) {
        boolean check  = values.isEmpty();
        numRows = check ? 0 : values.size();
        numCols = check ? 0 : values.get(0).size();
        convert2DArray(values);
    }
    private void convert2DArray(List<List<Integer>> values) {
        rowsMax = new int[numRows];
        colsMin = new int[numCols];
        Arrays.fill(rowsMax , Integer.MIN_VALUE);
        Arrays.fill(colsMin , Integer.MAX_VALUE);
        for(int i =0;i<numRows;i++){
            for(int j=0;j<numCols ; j++){
                int val = values.get(i).get(j);
                // i = rowNum-1 , j = colNum - 1
                rowsMax[i] = Math.max(rowsMax[i] , val);
                colsMin[j] = Math.min(colsMin[j],val);
            }
        }
    }
    public Set<SaddlePointsCoordinate> getSaddlePoints() {
        if(numRows==0 && numCols==0)
            return Collections.emptySet();
        Set<SaddlePointsCoordinate> answer = new HashSet<>();
        for(int i=0;i<numRows ; i++){
            for(int j=0;j<numCols;j++){
                if(rowsMax[i]==colsMin[j]){
                    answer.add(new SaddlePointsCoordinate(i+1,j+1));
                }
            }
        }
        return answer;
    }
}

class SaddlePointsCoordinate implements Comparable<SaddlePointsCoordinate> {
    private final int row;
    private final int col;
    SaddlePointsCoordinate(final int row, final int col) {
        this.row = row;
        this.col = col;
    }
    @Override
    public String toString() {
        return "Row: " + row + ", Column: " + col;
    }
    // Generated equals and hashcode.
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final SaddlePointsCoordinate that = (SaddlePointsCoordinate) o;
        return row == that.row && col == that.col;
    }
    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + col;
        return result;
    }
    @Override
    public int compareTo(SaddlePointsCoordinate o) {
        int rowComparison = Integer.compare(row, o.row);
        return (rowComparison == 0) ? Integer.compare(col, o.col) : rowComparison;
    }
}
