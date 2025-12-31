package com.microservices;

public class M21_Service_Discovery {
    public static void main(String[] args) {

        String challenge1 = """
                How do services locate each other inside a network?
                
                -> Every microservice runs on:
                
                   Different host
                   Different port
                
                -> Instances scale up/down dynamically.
                -> ✅ The solution: Service Discovery
                """;

        String challenge2 = """
                How do new service instances enter the network?
                
                -> Instances crash
                -> New ones are auto-created (Docker / Kubernetes)
                -> IPs keep changing
                -> Clients must immediately know about new instances
                -> ✅ The solution: Dynamic Registration + Heartbeats
                """;

        String challenge3 = """
                How do we load balance & share info between instances?
                
                -> Multiple instances of same service
                -> Which one should handle the request?
                -> How to avoid overload?
                -> ✅ The solution: Client-Side Load Balancing
                """;
    }
}
