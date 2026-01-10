package com.stream_codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class S02_Get_Duplicates {
    public static void main(String[] args) {

        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        HashSet<Integer> seem = new HashSet<>();

        List<Integer> duplicates = duplicateNumbers.stream()
                .filter(n -> !seem.add(n)).toList();

        System.out.println(duplicates);
    }
}
