package com.microservice_systemdesign;

public class M21_Service_Discovery {
    public static void main(String[] args) {

        String serviceDiscovery = """
                -> Service discovery is how other can communicate other other service using the
                   information present in the service registry.
                ->When one service wants to talk to another, it doesn’t guess the address. Instead, it asks the Service
                  Registry: The registry responds with the current location. Then the calling service connects directly.
                """;
    }
}
