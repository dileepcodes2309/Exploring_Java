package com.codes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class C14_SumOfAllDigits {
    public static void main(String[] args) {
        int i = 15623;
        Integer sumOfDigits = Arrays.stream(String.valueOf(i).split(""))
                .mapToInt(Integer::parseInt).sum();

        System.out.println(sumOfDigits);
    }
}
