package com.microservice_systemdesign;

public class M06_Strangler_Pattern {
    public static void main(String[] args) {

        String definition = """
                -> In strangler pattern, we gradually replace a legaccy application to a microservice
                   system.
                -> We move one feature of the system to a microservice.
                -> We redirect only the one feature's requests from the old system to the new service.
                """;

        String meaning = """
                The Strangler Pattern incrementally replaces a legacy system by routing new functionality
                to new services while the old system is gradually retired.
                """;
    }
}
