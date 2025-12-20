package com.codes;

import java.util.Arrays;
import java.util.List;

public class C08_FindingPalindrome {
    public static void main(String[] args) {
        List<String> palindromeNames = Arrays.asList("Telugu", "Tamil", "Malayalam");

        List<String> findPalindromeStrings = palindromeNames .stream()
                .filter(s -> {
                    return s.toLowerCase() .contentEquals(new StringBuilder(s.toLowerCase()).reverse());
                }).toList();
        System.out.println(findPalindromeStrings);
    }
}
