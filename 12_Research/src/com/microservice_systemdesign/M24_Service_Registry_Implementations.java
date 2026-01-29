package com.microservice_systemdesign;

public class M24_Service_Registry_Implementations {
    public static void main(String[] args) {

        String howToImplement = """
                We can use Eureka, built by Netflix, is one of the most popular tools for this in Spring Boot.
                """;

        String importantProperties = """
                
                eureka:
                    client:
                        register-with-eureka: false -> # Server doesn’t register itself
                        fetch-registry: false -> Server doesn’t fetch registry
                """;
    }
}
