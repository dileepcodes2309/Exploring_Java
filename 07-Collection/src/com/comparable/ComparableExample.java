package com.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(101, "Laptop", 1200.99),
                new Product(102, "Smartphone", 899.49),
                new Product(103, "Headphones", 199.99)
        );

        // Sorting based on Comparable (Price)
        Collections.sort(products);

        System.out.println("Products sorted by Price (Default):");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
