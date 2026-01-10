package com.stream_codes;

import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S03_Descending_Order {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 11, 1, 3, 5, 6, 5);

        List<Integer> result = list.stream().distinct()
                .sorted(Comparator.reverseOrder()).toList();

        System.out.println(result);
    }
}
