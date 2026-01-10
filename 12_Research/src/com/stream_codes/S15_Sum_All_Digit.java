package com.stream_codes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class S15_Sum_All_Digit {
    public static void main(String[] args) {

        int i = 15623;

        int sum = Arrays.stream(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sum);
    }
}
