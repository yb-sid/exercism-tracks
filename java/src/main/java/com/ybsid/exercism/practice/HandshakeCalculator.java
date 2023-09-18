package com.ybsid.exercism.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://exercism.org/tracks/java/exercises/secret-handshake">...</a>
 */

class HandshakeCalculator {
    List<Signal> calculateHandshake(int number) {
        List<Signal> answer = new ArrayList<>();
        int count = 0;
        while(number!=0 && count!=5){
            count+=1;
            if((number&1)==1){
                if(count==1)
                    answer.add(Signal.WINK);
                if(count==2)
                    answer.add(Signal.DOUBLE_BLINK);
                if(count==3)
                    answer.add(Signal.CLOSE_YOUR_EYES);
                if(count==4)
                    answer.add(Signal.JUMP);
                if(count == 5 )
                    Collections.reverse(answer);
            }
            number = number>>1;
        }

        return answer;
    }
}

enum Signal {
    WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP
}
