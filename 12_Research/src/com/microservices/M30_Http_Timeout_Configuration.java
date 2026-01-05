package com.microservices;

public class M30_Http_Timeout_Configuration {
    public static void main(String[] args) {

        String stepsToFollow = """
                -> Add below property inside webflux
                             httpclient:
                               connect-timeout: 1000
                               response-timeout: 2s
                """;
    }
}
