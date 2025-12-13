package com.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(new Product(101, "Laptop", 1200.99),
                new Product(102, "Smartphone", 899.49), new Product(103, "Headphones", 199.99));

        // Sorting by Name
        Collections.sort(products, new NameComparator());
        System.out.println("Products sorted by Name:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Sorting by Price (Descending)
        Collections.sort(products, new PriceComparatorDescending());
        System.out.println("\nProducts sorted by Price (Descending):");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
