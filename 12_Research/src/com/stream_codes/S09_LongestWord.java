package com.stream_codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S09_LongestWord {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");

        String word = words.stream()
                .max(Comparator.comparing(String::length)).orElse(null);

        System.out.println(word);
    }
}
