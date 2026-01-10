package com.stream_codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class S01_Remove_Duplicates {
    public static void main(String[] args) {

        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        HashSet<Integer> seen = new HashSet<>();

        List<Integer> uniqueNumbers = duplicateNumbers.stream()
                .filter(seen::add).toList();

        System.out.println(uniqueNumbers);
    }
}
