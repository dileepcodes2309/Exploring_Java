package com.stream_codes;

import java.util.Arrays;
import java.util.List;

public class S18_Number_Of_Occurrences {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");

        String word = "java";

        long count = strings.stream()
                .flatMap(s-> Arrays.stream(s.split(" ")))
                .peek(System.out::println)
                .filter(w-> w.equals(word))
                .count();
        System.out.println(count);
    }
}
