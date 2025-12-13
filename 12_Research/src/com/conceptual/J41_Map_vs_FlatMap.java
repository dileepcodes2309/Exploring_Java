package com.conceptual;

public class J41_Map_vs_FlatMap {
    public static void main(String[] args) {

        String map = """
                -> The map() method transforms each element of a stream into another object.
                -> It takes a Function as an argument, which defines the transformation logic.
                -> This function is applied to each stream element, and the result is collected into a new stream.
                """;

        String flatMap = """
                -> The flatMap() method takes each element in the stream, applies a function to it,
                   and that function returns another stream (could have 0, 1, or many elements).
                -> elements).Then, flatMap() takes all those small streams and joins them into one big stream.
                """;
    }
}
