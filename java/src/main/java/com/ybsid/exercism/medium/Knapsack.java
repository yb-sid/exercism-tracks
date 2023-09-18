package com.ybsid.exercism.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://exercism.org/tracks/java/exercises/knapsack">...</a>
 */

public class Knapsack{
    private final Map<String , Integer> memo = new HashMap<>();
    public int maximumValue(int cap , List<Item> items){
        int n = items.size();
        return solveKnapSack(cap , n , items);
    }
    private int solveKnapSack(int maxCap , int n , List<Item> values){
        if(n==0||maxCap==0){
            return 0;
        }
        String key = maxCap+"+"+n;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        if(values.get(n-1).getWeight()>maxCap){
            memo.put(key,solveKnapSack(maxCap , n-1 , values));
            return memo.get(key);
        }else {
            
            memo.put( key,
              Math.max(
                    values.get(n-1).getValue()+solveKnapSack(maxCap-values.get(n-1).getWeight(),n-1,values),
                    solveKnapSack(maxCap,n-1,values)
            )
            );
            return memo.get(key);
        }
    }
}
class Item {
    private final int weight;
    private final int value;
    public Item(final int weight, final int value) {
        this.weight = weight;
        this.value = value;
    }
    public int getWeight() {
        return weight;
    }
    public int getValue() {
        return value;
    }
}