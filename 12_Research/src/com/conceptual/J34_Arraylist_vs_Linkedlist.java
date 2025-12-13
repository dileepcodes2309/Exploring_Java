package com.conceptual;

public class J34_Arraylist_vs_Linkedlist {
    public static void main(String[] args) {

        String arrayList = """
                -> ArrayList is backed by Dynamic array.
                -> Access the element is because we use index number to access.
                -> Inserting or deleting an element may be slow because it requires shifting
                   of elements.
                """;

        String linkedList = """
                -> LinkedList is backed by double linkedList and each node holds a reference to
                   next and to the previous.
                -> Access the desired element is slow because we need to traverse the list from
                   the beginning or end until we reach the desired index.
                """;

        System.out.println(arrayList);
        System.out.println(linkedList);

        /*
        If you are inserting an element in the middle of a LinkedList with 10 million items,
        how will it perform compared to an ArrayLis

LinkedList: Inserting in the middle requires traversing to that position (O(n)) and then updating pointers (O(1)). So overall O(n).
ArrayList: Inserting in the middle requires shifting all elements after that index (O(n)).
For 10 million items:

Both are O(n), but in practice, LinkedList can be slightly faster for insertion since no shifting of elements is needed, only pointer updates.
Rule:

Use LinkedList if frequent insertions/deletions in the middle are needed.

Use ArrayList if random access and iteration speed matter more.
         */
    }
}
