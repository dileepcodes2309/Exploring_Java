package com.microservice_systemdesign;

public class M22_Client_Side_Discovery {
    public static void main(String[] args) {

        String whatIsIt = """
                In client side discovery, if service A wants to connect with service b then
                service a calls the service registry where service b is running. Service Registry gives
                the service b address the service a connects with service b.
                
                The client decides which instance of Service B to call if there are multiple running. It even handles load
                balancing on its own.
                
                Client -> Service Registry -> Get address of Service B -> Call Service B
                """;
    }
}
