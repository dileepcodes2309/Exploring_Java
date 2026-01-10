package com.stream_codes;

import java.util.Arrays;
import java.util.List;

public class S07_Number_With_1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 12, 20, null, 19, 30);

        List<Integer> newStartsWithOne = numbers.stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .toList();

        System.out.println(newStartsWithOne);
    }
}
