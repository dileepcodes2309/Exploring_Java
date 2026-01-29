package com.microservice_systemdesign;

public class M23_Server_Side_Discovery {

    public static void main(String[] args) {

        String whatIsIt = """
                In server-side discovery, the client is simple.
                It sends the request to a load balancer or API gateway, which then talks to the
                Service Registry, finds the correct instance of the service, and forwards the request.
                
                Client -> Load Balancer / API Gateway -> Service Registry -> Service B
                """;
    }
}
