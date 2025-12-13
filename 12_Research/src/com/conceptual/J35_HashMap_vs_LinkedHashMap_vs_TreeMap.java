package com.conceptual;

public class J35_HashMap_vs_LinkedHashMap_vs_TreeMap {
    public static void main(String[] args) {

        String hashMap = """
                ->It use hash table to store data.
                ->It does not maintain insertion order.
                ->It is fast as compare to TreeMap and LinkedHashMap.
                ->It allows one null key and many null values.
                """;

        String linkedListHashMap = """
                -> It also uses hash table as well as it use LinkedList to keep the insertion order.
                -> It remembers insertion order.
                -> It is slightly slower as it need to keep the track of insertion.
                -> It allows one null key and many null values.
                """;

        String treeMap = """
                -> Stores data in a sorted tree structure (like a family tree), it keeps keys in order.
                -> Sorts keys automatically (alphabetically or numerically).
                -> Slower than HashMap because it keeps keys sorted.
                -> Does NOT allow null keys , but allows null values.
                """;

        String whenToUseWhich = """
                Use HashMap: When we need fast access and don’t care about order.
                Use LinkedHashMap: When we need insertion order (like a history log).
                Use TreeMap: When we need sorted keys (like a dictionary).
                """;
    }
}
