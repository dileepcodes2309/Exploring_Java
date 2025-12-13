package com.conceptual;

public class J33_List_vs_Set_vs_Map {
    public static void main(String[] args) {

        String list = """
                -> We use List to list of items.
                -> It maintains the insertion order.
                -> Duplicates are allowed.
                -> We can access the item by index value.
                -> It can hold any number of null values.
                -> We use ListIterator to traverse.
                -> Implementation classes are ArrayList and LinkedList
                """;

        String set = """
                -> We used set to store unique elements.
                -> It does not maintain insertion order.
                -> Duplicates are not allowed.
                -> It can hold only one null value.
                -> We can use Iterator to traverse.
                -> HashSet, LinkedListHashSet and TreeSet are its implementation class.
                """;

        String map = """
                -> We uses Map to store key-value pair.
                -> It allows only one key as null and multiple null values.
                -> HashMap, TreeMap, ConcurrentHashMap are its implementation class.
                -> We can use keySet(), values(), and entrySet to traverse.
                """;
    }
}
