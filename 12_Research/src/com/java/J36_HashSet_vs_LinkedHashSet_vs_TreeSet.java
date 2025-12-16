package com.java;

public class J36_HashSet_vs_LinkedHashSet_vs_TreeSet {
    public static void main(String[] args) {

        String hashSet = """
                -> Insertion order is not maintained.
                -> It uses HashMap to store elements.
                -> Generally offers the best performance for add, remove, and contains operations (O(1)
                   on average) due to the efficient hashing mechanism.
                """;

        String linkedHashSet = """
                -> It maintains insertion order.
                -> It uses a LinkedHashMap internally, which maintains a doubly-linked list to track 
                   insertion order.
                -> Performance is slightly slower than HashSet because of the overhead of maintaining the linked list,
                   but still generally fast (O(1) on average for most operations).
                """;

        String treeSet = """
                -> Sorted. Elements are stored in a sorted order, either according to their natural ordering or
                   based on a provided Comparator.
                -> TreeSet uses a TreeMap internally, which is a self-balancing binary search tree.
                -> Performance is generally slower than both HashSet and LinkedHashSet (O(log n) for add, 
                   remove, and contains operations) because of the sorting overhead.
                """;

        String whenToUseWhich = """
                -> Use HashSet , when we need to store unique elements and don't care about the order 
                   they are stored in, and when we need fast performance.
                   
                -> Use LinkedHashSet, when we need to store unique elements and need to iterate through them in 
                   the same order they were added.
                   
                -> Use TreeSet, when we need to store unique elements in a sorted order.
                """;
    }
}
