package com.java;

public class J40_Stream_vs_Collection {
    public static void main(String[] args) {

        String collection = """
                -> Collections, like List, Set, and Map are used hold the data.
                -> It is like a container.
                -> We can add the items, retrieve the items and update them.
                -> They will be saved in memory.
                """;

        String streams = """
                -> They don't hold any thing.
                -> They just describe how data should be processed.
                -> We just say, ‘take this list, filter out the even numbers,
                  map each number to its square, and collect the result.’
                """;

        /*
        So, the core difference is, Collections are about storing data. Streams are about processing data.
         */
    }
}
