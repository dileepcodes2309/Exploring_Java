package com.codes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class C16_ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String reversed = Arrays.stream(str.split(" "))
                .reduce((word1, word2) -> word2 + " " + word1)
                .orElse("");

        System.out.println(reversed);

        /*
        How reduce works
        reduce() format:
        .reduce((a, b) -> something)


        a → accumulated result (what we have so far)

        b → next element from stream
         */
    }
}
