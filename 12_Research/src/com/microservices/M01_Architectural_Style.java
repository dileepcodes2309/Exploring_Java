package com.microservices;

public class M01_Architectural_Style {
    public static void main(String[] args) {

        String whatIs = """
                -> Architectural Style defines, how a system is structured at high level.
                -> It gives us a "big picture" view of the system - like looking at its
                   from a helicopter.
                -> It shows how a system is designed and how its major part are communicate with each
                   other.
                """;

        String examples = """
                Microservices Architecture
                Example:
                Order, Payment, User as separate services
                Communicate via REST APIs
                
                Publish–Subscribe
                Example:
                Kafka / RabbitMQ
                One service publishes an event
                Multiple services consume it
                """;
    }
}
