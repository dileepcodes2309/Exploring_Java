package com.codes;

import java.util.HashSet;
import java.util.Set;

public class C07_SubsetCheck {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 5};
        boolean flag = true;

        Set<Integer> hashSet = new HashSet<>();

        for(int num:arr1)
            hashSet.add(num);

        for(int num:arr2){
            if(!hashSet.contains(num))
                flag = false;
        }

        if(flag == false)
            System.out.println("No Subset");
        else
            System.out.println("Subset");
    }
}
