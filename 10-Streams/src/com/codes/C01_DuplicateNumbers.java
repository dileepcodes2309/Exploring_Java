package com.codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class C01_DuplicateNumbers {
    public static void main(String[] args) {

        List<Integer> duplicateElements = Arrays.asList(23,90,111,33,11,90,111);

        Set<Integer> seen = new HashSet<>();

        List<Integer> uniqueNumber = duplicateElements.stream()
                .filter(seen::add).collect(Collectors.toList());

        System.out.println(uniqueNumber);
    }
}
