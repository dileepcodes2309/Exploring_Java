package com.codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class C02_GetDuplicates {
    public static void main(String[] args) {
        List<Integer> duplicateElements = Arrays.asList(23,90,111,33,11,90,111);

        Set<Integer> seen = new HashSet<>();

        List<Integer> getDuplicates = duplicateElements.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toList());

        System.out.println(getDuplicates);
    }
}
