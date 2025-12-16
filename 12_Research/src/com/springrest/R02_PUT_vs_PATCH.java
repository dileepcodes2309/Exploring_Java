package com.springrest;

public class R02_PUT_vs_PATCH {
    public static void main(String[] args) {

        String put = """
                It replaces the entire resource with the new one. If we don't provide some fields, they
                can be overwritten with null value.
                """;

        String patch = """
                Partially updates means only the fields we send are updated, the rest stay unchanged.
                """;
    }
}
