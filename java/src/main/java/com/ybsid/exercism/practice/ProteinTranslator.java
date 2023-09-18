package com.ybsid.exercism.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://exercism.org/tracks/java/exercises/protein-translation">...</a>
 */
class ProteinTranslator {
    Map<String,String> memo;
    public ProteinTranslator(){
        this.memo = new HashMap<>();
        memoValues(); 
    }
    private void memoValues() {
        memo.put("AUG","Methionine");
        memo.put("UUU","Phenylalanine");
        memo.put("UUC","Phenylalanine");
        memo.put("UUA","Leucine");
        memo.put("UUG","Leucine");
        memo.put("UCU","Serine");
        memo.put("UCC","Serine");
        memo.put("UCA","Serine");
        memo.put("UCG","Serine");
        memo.put("UAU","Tyrosine");
        memo.put("UAC","Tyrosine");
        memo.put("UGU","Cysteine");
        memo.put("UGC","Cysteine");
        memo.put("UGG","Tryptophan");
        memo.put("UAA","STOP");
        memo.put("UAG","STOP");
        memo.put("UGA","STOP");
    }
    List<String> translate(String rnaSequence) {
        List<String> answer = new ArrayList<>();
        int i=0;
        int j = 3;
        int n = rnaSequence.length();
        while (j<=n){
            String codon = rnaSequence.substring(i, j);
            String protein = memo.get(codon);
            if("STOP".equalsIgnoreCase(protein)){
                return answer;
            }else{
                answer.add(protein);
            }
            i+=3;
            j+=3;
        }
        
        return answer;
    }
}