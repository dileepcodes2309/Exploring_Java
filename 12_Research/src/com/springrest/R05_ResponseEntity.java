package com.springrest;

public class R05_ResponseEntity {
    public static void main(String[] args) {

        String responseEntity = """
                -> It is a class that represent the HTTP response.
                -> It allows us to set not only the body of the response but also the status code and
                   header.
                """;

        String whyToUse = """
                -> To customize HTTP status code.
                -> To set custom headers (like authentication tokens, cache control)
                -> To send data + metadata together
                """;
    }
}
