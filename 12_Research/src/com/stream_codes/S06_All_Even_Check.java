package com.stream_codes;

import java.util.Arrays;
import java.util.List;

public class S06_All_Even_Check {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        boolean flag = numbers.stream()
                .allMatch(n->n%2==0);

        System.out.println(flag);
    }
}
