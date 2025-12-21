package com.codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_RepeatingElements {
    public static void main(String[] args) {

        int[] arr = { 2, 5, 6, 2, 1, 3, 1, 8, 3 };

        List<Integer> duplicateNumbers = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for(int num:arr){
            if(!seen.add(num))
                duplicateNumbers.add(num);
        }

        System.out.println(duplicateNumbers);
    }
}
