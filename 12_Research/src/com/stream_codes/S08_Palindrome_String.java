package com.stream_codes;

import java.util.Arrays;
import java.util.List;

public class S08_Palindrome_String {
    public static void main(String[] args) {

        List<String> palindromeNames = Arrays.asList("Telugu", "Tamil", "Malayalam");

        List<String> names = palindromeNames.stream()
                .filter(s -> {
                    return s.toLowerCase().contentEquals(new StringBuilder(s.toLowerCase()).reverse());
                        }).toList();

        System.out.println(names);
    }
}
