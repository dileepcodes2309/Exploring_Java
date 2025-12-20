package com.codes;

import java.util.Arrays;
import java.util.List;

public class C06_CheckAllEvenNumbers {
    public static void main(String[] args) {

        List<Integer> evenNumbers = Arrays.asList(2,28,90,16);
        boolean flag = evenNumbers.stream()
                .allMatch(n->n%2==0);
        System.out.println(flag);

        List<Integer> randomNumbers = Arrays.asList(3,15,8);

        boolean value = randomNumbers.stream()
                .anyMatch(m->m%2==0);
        System.out.println(value);
    }
}
