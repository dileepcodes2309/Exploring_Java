package com.codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C13_ThirdHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 11, 1, 3, 5, 6, 5);

        int thirdHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(-1);

        System.out.println(thirdHighest);
    }
}
