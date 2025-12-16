package com.java;

public class J38_HashMap_Internal_Implementation {
    public static void main(String[] args) {

        String howItStores = """
                -> Behind the scene JVM creates few buckets let's say 0 to 15.
                -> Then JVM generate the hashcode of the key element.
                -> Based on hashcode and bucket size the index number is calculated and the value will
                   be stored there.
                -> But in case of null key, it's hashcode can't be calculated then it will stored at
                   0th index but only once because 0 is occupied now.
                -> If JVM generate a hashcode for a key which is already present then hash collision
                   will happen then in that case JVM use linkedList approach and on that index multiple
                   values will be stored.
                """;

        System.out.println(howItStores);
    }
}
