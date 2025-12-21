package com.codes;

import java.util.*;

public class C06_Non_Repeating {
    public static void main(String[] args) {

        int arr[] = {9, 8, 4, 9, 5, 4, 9, 1};

        Map<Integer,Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        List<Integer> nonRepeatedValues = new ArrayList<>();

        Set<Integer> keys = freq.keySet();

        for(int n:keys){
            if(freq.get(n)==1)
                nonRepeatedValues.add(n);
        }

        System.out.println(nonRepeatedValues);
    }
}
