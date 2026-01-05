package com.microservices;

public class M31_Retry_Pattern {
    public static void main(String[] args) {

        String explanation = """
                -> Retry pattern means that system automatically tries the same request with limited
                   number of times.
                   It is used when failures are temporary not permanent.
                """;

        String whyWeNeed = """
                Because in distributed systems:
                -> Network can be slow.
                -> Service can be busy.
                -> First request may fail, second may succeed.
                """;

    }
}
