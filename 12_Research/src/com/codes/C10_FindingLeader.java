package com.codes;

import java.util.ArrayList;
import java.util.List;

public class C10_FindingLeader {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        List<Integer> leaders = new ArrayList<>();
        int max = arr[arr.length-1];
        leaders.add(max);

        for(int i=0;i<arr.length-2;i++){
            if(arr[i]>max){

                max = arr[i];
                leaders.add(max);
            }
        }

        System.out.println(leaders);
    }
}
