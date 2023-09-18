package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/matrix">...</a>
 */
public class Matrix {
    int[][] matrix;
    int rows;
    int cols;
    int[][] buildMatrix(String[] lines , int rows , int cols){
        int[][] mat = new int[rows][cols];
        for(int i=0;i<rows;i++){
            String[] row = lines[i].split(" ");
            for(int j=0;j<cols;j++){
                mat[i][j] = Integer.parseInt(row[j]);
            }
        }
        return mat;
    }
    public Matrix(String matrixAsString) {
        String[] lines = matrixAsString.split("\n");
        int n = lines.length;
        int m = lines[0].split(" ").length;
        matrix = buildMatrix(lines,n,m);
        rows = n;
        cols = m;
    }
    int[] getRow(int rowNumber) {
        return matrix[rowNumber-1];
    }
    int[] getColumn(int columnNumber) {
        int[] col = new int[rows];
        for(int i =0;i<rows;i++){
            col[i] = matrix[i][columnNumber-1];
        }
        return col;
    }
}

