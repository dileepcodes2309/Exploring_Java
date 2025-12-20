package com.codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class C09_LongestWord {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");
        Optional<String> longestWord = words.stream().max(Comparator.comparingInt(String::length));
        longestWord.ifPresent(word -> System.out.println("The longest word is: " + word));
    }
}
