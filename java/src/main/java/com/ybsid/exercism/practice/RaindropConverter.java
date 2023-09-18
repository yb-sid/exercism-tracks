package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/raindrops">...</a>
 */
public class RaindropConverter {
    String convert(int n) {
        StringBuilder st = new StringBuilder();
        if(n%3==0){
            st.append("Pling");
        }if(n%5==0){
            st.append("Plang");
        }if(n%7==0) {
            st.append("Plong");
        }if(st.isEmpty()){
            st.append(n);
        }
        return st.toString();
    }
}
