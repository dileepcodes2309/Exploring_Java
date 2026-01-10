package com.stream_codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S04_Sorted_Length {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> sortedStrings = listOfStrings.stream()
                .sorted(Comparator.comparing(String::length)).toList();

        System.out.println(sortedStrings);
    }
}
