package com.microservice_systemdesign;

public class M15_Asynchronous_Communication {

    public static void main(String[] args) {

        String meaning = """
                -> Asynchronous communication is a way for services to talk without waiting for a response
                   immediately.
                -> One service sends a message or event, and the other processes it when it can.
                """;

        String working = """
                -> Service A sends a message to Service B.
                -> Service A continues its work without waiting for Service B to respond.
                -> Service B processes the message later and may trigger another event.
                """;
    }
}
