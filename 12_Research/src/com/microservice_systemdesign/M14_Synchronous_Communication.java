package com.microservice_systemdesign;

public class M14_Synchronous_Communication {
    public static void main(String[] args) {

        String meaning = """
                -> One microservice calls another and waits for the response before continuing.
                """;

        String howToAchieve = """
                HTTP Request:
                Services use REST APIs over HTTP to talk to each other.
                One service sends a request, waits for the response, and continues.
                
                gRPC
                
                Feign Client (Spring Boot)
                
                WebClient / RestTemplate
                """;
    }
}
