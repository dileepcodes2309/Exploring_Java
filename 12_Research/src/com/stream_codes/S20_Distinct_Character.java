package com.stream_codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class S20_Distinct_Character {

    public static void main(String[] args) {

        List<String> words = List.of("java", "scala");

        Set<String> characters = words.stream()
                .flatMap(w -> Arrays.stream(w.split("")))
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toSet());

        System.out.println(characters);
    }
}
