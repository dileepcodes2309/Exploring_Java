package com.codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C04_SortingLength {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> orderByLength = names.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(orderByLength);
    }
}
