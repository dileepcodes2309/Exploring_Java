package com.codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C12_TopThree {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11, 11, 1, 3, 5, 6, 5);

        List<Integer> topThree = numbers.stream()
                .sorted(Comparator.reverseOrder()).limit(3).toList();

        System.out.println(topThree);
    }
}
