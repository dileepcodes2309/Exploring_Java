package com.stream_codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S13_Third_Highest {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        int thirdHighest = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(0);

        System.out.println(thirdHighest);
    }
}
