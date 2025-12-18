package com.codes;

import java.util.Arrays;

public class C01_ReverseArray {
    public static void main(String[] args) {

        int[] arr = {2,5,6,4,1,3};
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = arr.length - 1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
