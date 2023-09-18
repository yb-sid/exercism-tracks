package com.ybsid.exercism.practice;

import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://exercism.org/tracks/java/exercises/diamond">...</a>
 */
class DiamondPrinter {
    List<String> printToList(char a) {
        int num = a-'A';
        int size = 2*(num)+ 1;
        String[] lines = new String[size];
        for(int i=0;i<size/2+1;i++){
            char c = (char)('A'+i);
            int left = size/2-i;
            int right = size-left-1;
            char[] arr = new char[size];
            Arrays.fill(arr,' ');
            arr[left] = c;
            arr[right] = c;
            String line = new String(arr);
            lines[i] = line;
            lines[size-1-i] = line;
        }
        return Arrays.asList(lines);
    }
}