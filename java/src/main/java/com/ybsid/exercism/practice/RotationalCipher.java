package com.ybsid.exercism.practice;

import java.util.stream.Collectors;

/**
 * <a href="https://exercism.org/tracks/java/exercises/rotational-cipher">...</a>
 */
public class RotationalCipher {
    int[] ceasar = new int[26];
    RotationalCipher(int shiftKey) {
        for(int i =0;i<26;i++){
            // 0-> 'a' , 25-> 'z'
            if(shiftKey==0||shiftKey==26){
                ceasar[i] = (char) ((char)97 + i);
            }else{ // [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]
                int check = 'a'+i + shiftKey;
                ceasar[i] = (check>122)? (char) (check-26) :(char)(check);
            }
        }
    }
    String rotate(String data) {
        return data.chars().mapToObj(c -> (char)c).map(c -> {
            if(Character.isLetter(c)) {
                int index = (int) Character.toLowerCase(c) - 'a';
                int replace = ceasar[index];
                return Character.isUpperCase(c) ? Character.toUpperCase((char) replace) : (char) replace;
            }else{
                return c;
            }
        }).map(Object::toString).collect(Collectors.joining());
    }
}
