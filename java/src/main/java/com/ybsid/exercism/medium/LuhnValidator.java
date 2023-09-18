package com.ybsid.exercism.medium;

import java.util.Arrays;

/**
 * <a href="https://exercism.org/tracks/java/exercises/luhn">...</a>
 */
class LuhnValidator {
    boolean isValid(String num){
        num = num.replaceAll(" ","");
        if(num.length()<=1 || !num.matches("^[0-9]+$"))
            return false;
        String noSpace = num.replaceAll("[^0-9]","");
        int[] arr = Arrays.stream(noSpace.split("")).mapToInt(Integer::parseInt).toArray();
        int j=0;
        int n = arr.length;
        int sum = 0;
        for(int i=n-1;i>=0;i--){
            if(j%2!=0){
                sum += arr[i]>4 ? arr[i]*2 - 9 : arr[i]*2;
            }else{
                sum += arr[i];
            }
            j+=1;
        }
        return sum%10==0;
    }
}
