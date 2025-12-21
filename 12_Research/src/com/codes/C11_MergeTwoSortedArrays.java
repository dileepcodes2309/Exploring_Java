package com.codes;

import java.util.Arrays;
import java.util.stream.Stream;

public class C11_MergeTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = { 2, 4, 6, 7, 9 };
        int[] arr2 = { 5, 8, 10, 12 };

        int[] c = Stream.concat( Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
                .sorted() .mapToInt(i -> i) .toArray();

        System.out.println(Arrays.toString(c));
    }
}
