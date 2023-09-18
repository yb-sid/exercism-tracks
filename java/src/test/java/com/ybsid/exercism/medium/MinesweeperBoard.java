package com.ybsid.exercism.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MinesweeperBoard{
    List<String> board;
    public MinesweeperBoard(List<String> inputBoard){
        this.board = inputBoard;
    }
    public List<String> withNumbers(){
        if(board.isEmpty())
            return Collections.emptyList();
        char[][] boardMatrix = buildMatrix();
        int m = boardMatrix.length;
        int n = boardMatrix[0].length;
        List<String> answer = new ArrayList<>();
        // space & * chars in board
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(boardMatrix[i][j]!='*'){
                    // check in 8 directions
                    int count = countMines(boardMatrix, i , j , m , n);
                    if(count!=0)
                        boardMatrix[i][j] = (char)(count+'0');
                }
            }
            char[] newRow = boardMatrix[i];
            String row = new String(newRow);
            answer.add(row);
        }
        return answer;
    }
    private int countMines(char[][] boardMatrix, int i, int j, int m, int n) {
        int[] xDir = {0,-1,-1,-1,0,1,1,1};
        int[] yDir = {-1,-1,0,1,1,1,0,-1};
        int count = 0;
        for(int ind=0;ind<8;ind++){
            int x = i + xDir[ind];
            int y = j + yDir[ind];
            if(x>=0 && x<m && y>=0 && y<n){
                if(boardMatrix[x][y]=='*'){
                    count += 1;
                }
            }
        }
        return count;
    }
    private char[][] buildMatrix() {
        int numRows = board.size();
        int numCols = board.get(0).length();
        char[][] matrix = new char[numRows][numCols];
        for(int i=0;i<numRows;i++){
            char[] row = board.get(i).toCharArray();
            matrix[i] = row;
        }
        return matrix;
    }
}