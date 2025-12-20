package com.codes;

import java.util.Arrays;
import java.util.List;

public class C10_EvenNumbersList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> evenNumbers = list.stream()
                .filter(n->n%2==0).toList();

        System.out.println(evenNumbers);
    }
}
