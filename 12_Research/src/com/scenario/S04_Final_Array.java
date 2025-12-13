package com.scenario;

import java.util.Arrays;

public class S04_Final_Array {
    public static void main(String[] args) {

        final int[] arr = {1,2,3};

        arr[0] = 99;

        System.out.println(Arrays.toString(arr));

        /*
        Output will be [99,2,3]
        final means, we can’t reassign the value to ‘arr’ but we can change the content.
         */
    }
}
