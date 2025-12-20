package com.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C07_NumberStartsWith1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,22,13,11);

        List<Integer> number1 = numbers.stream()
                .filter(n->String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(number1);
    }
}
