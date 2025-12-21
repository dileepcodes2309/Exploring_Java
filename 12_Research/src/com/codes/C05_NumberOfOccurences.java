package com.codes;

import java.util.HashMap;
import java.util.Map;

public class C05_NumberOfOccurences {
    public static void main(String[] args) {
        int arr[] = {9, 8, 4, 9, 5, 4, 9, 1};

        Map<Integer,Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        System.out.println(freq);
    }

    //getOrDefault(num,0) -> if element found return its key or 0
}
