package com.stream_codes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class S17_Reverse_Each_Word {
    public static void main(String[] args) {

        String str = "Java Concept Of The Day";

        String reversed = Arrays.stream(str.split(" "))
                .map(w ->new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversed);
    }
}
