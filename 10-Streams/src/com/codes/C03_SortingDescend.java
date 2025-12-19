package com.codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C03_SortingDescend {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11, 11, 1, 3, 5, 6, 5);

        List<Integer> sorting = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());


        System.out.println(sorting);
    }
}
