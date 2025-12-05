package com.conceptual;

public class J20_String_vs_Builder_vs_Buffer {
    public static void main(String[] args) {

        String string = """
                String is immutable and thread safe.
                """;

        String stringBuffer = """
                It is mutable and thread safe.
                All the methods of StringBuffer are synchronized.
                """;

        String stringBuilder = """
                It is also mutable.
                It is not thread safe.
                """;
    }
}
