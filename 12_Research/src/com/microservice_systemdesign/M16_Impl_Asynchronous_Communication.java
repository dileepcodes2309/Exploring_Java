package com.microservice_systemdesign;

public class M16_Impl_Asynchronous_Communication {
    public static void main(String[] args) {

        String howTOAchieve = """
                -> Asynchronous communication is usually implemented using a message broker where
                   services exchange events or messages instead of calling each other directly.
                """;

        String explanation = """
                👉 Service A sends a message to a Message Broker
                👉 Service B reads (consumes) that message from the Message Broker
                
                Service A and Service B never talk to each other directly.
                
                That’s asynchronous communication.
                """;
    }
}
