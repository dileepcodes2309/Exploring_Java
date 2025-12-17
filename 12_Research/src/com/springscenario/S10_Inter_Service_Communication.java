package com.springscenario;

public class S10_Inter_Service_Communication {
    public static void main(String[] args) {
        /*
        Imagine you have a big e-commerce platform. It is not just one big application. Instead, you have split it into multiple services (microservices). For example:

        User Service: manages users, profiles, authentication

        Order Service: manages orders, cart, checkout

        Payment Service: processes payments

        Inventory Service: keeps track of stock
        How you make communication between the services?
         */

        String answer = """
                
                1. Synchronous Communication:
                Example: The Order Service makes a REST API call to the Payment Service (POST /payments) and waits until it gets a success or failure response.
                Tools we can use:
                
                REST (HTTP/JSON): simple and widely used
                
                gRPC: faster, binary protocol, good for high-performance communication
                In Spring, we can use RestTemplate or WebClient
                
                
                2. Asynchronous Communication (Message driven)
                Example: The Order Service publishes an event like OrderCreated to a message broker. The Payment Service listens for that event, processes payment
                Tools we can use:
                
                Kafka
                
                RabbitMQ
                
                Google Pub/Sub / AWS SQS
                """;

    }
}
