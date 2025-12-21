package com.codes;

import java.util.Arrays;

public class C09_MoveAllZeros {
    public static void main(String[] args) {

        int[] arr = { 0, 2, 3, 0, 0, 1, 4, 0, 0 };

        int[] newArray = new int[arr.length];

        int countZero = 0;
        int i = 0;

        for(int num:arr){
            if(num==0){
                countZero++;
            }
            else{
                newArray[i] = num;
                i++;
            }
        }

        while (countZero > 0){
            newArray[i] = 0;
            i++;
            countZero--;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
