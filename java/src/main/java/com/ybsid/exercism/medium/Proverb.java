package com.ybsid.exercism.medium;


/**
 * <a href="https://exercism.org/tracks/java/exercises/proverb">...</a>
 */
class Proverb {
    private String[] words;
    String commonFormat = "For want of a %s the %s was lost.";
    String lastLine = "And all for the want of a %s.";
    
    Proverb(String[] words) {
        this.words = words.clone();
    }
    String recite() {
        if(this.words.length==0) return "";
        StringBuilder answer = new StringBuilder();
        int i=0;
        int j=1;
        while(j< words.length){
            String temp = String.format(commonFormat , words[i] , words[j]);
            answer.append(temp);
            answer.append('\n');
            i++;
            j++;
        }
        answer.append(String.format(lastLine,words[0]));
        return answer.toString();
    }
}