package com.ybsid.exercism.practice;

import java.util.List;

/**
 * <a href="https://exercism.org/tracks/java/exercises/binary-search">...</a>
 */
class BinarySearch {
    int[] arr;
    public BinarySearch(List<Integer> array){
        this.arr = array.stream().mapToInt(e->e).toArray();
    }
    public int indexOf(int num) throws ValueNotFoundException {
        return search(num , arr);
    }
    private int search(int a, int [] arr) throws ValueNotFoundException {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==a){
                return mid;
            }else if(arr[mid]>a){
                right = mid -1;
            }else {
                left = mid +1;
            }
        }
        throw new ValueNotFoundException("Value not in array");
    }
}

class ValueNotFoundException extends Exception {
    ValueNotFoundException(String message) {
        super(message);
    }
}
