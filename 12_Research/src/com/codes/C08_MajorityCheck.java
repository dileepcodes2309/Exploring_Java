package com.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C08_MajorityCheck {
    public static void main(String[] args) {

        int[] numbers = { 2, 2, 1, 1, 1, 2, 2,9,9,9,9,9,9,9};
        int majority = 0;
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num:numbers)
            freq.put(num,freq.getOrDefault(num,0)+1);

        System.out.println(freq);

        Set<Integer> keys = freq.keySet();

        for(int k:keys){
            if(freq.get(k)>numbers.length/2)
                majority = k;
        }

        System.out.println(majority);
    }
}
