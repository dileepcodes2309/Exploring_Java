package com.conceptual;

public class J37_ArrayList_Internal_Implementation {
    public static void main(String[] args) {

        String howItWorks = """
                
                -> ArrayList in Java uses dynamic array to store elements.
                -> All elements are stored inside this internal Object[].
                -> When we create an ArrayList, it starts with a default capacity,
                   which is usually 10, unless we give a specific value.
                -> When we add element, it creates a new array of bigger size which is typically
                   1.5x times the old one.
                -> All elements are copied from the old array to the new one.
                -> The old array is discarded.
                
                """;

        String interviewAnswer = """
                ArrayList uses a dynamic array internally. It grows automatically by 1.5x when capacity is full. 
                Access is O(1),but insertion and deletion in the middle are O(n).
                """;

        System.out.println(howItWorks);
        System.out.println(interviewAnswer);
    }
}
