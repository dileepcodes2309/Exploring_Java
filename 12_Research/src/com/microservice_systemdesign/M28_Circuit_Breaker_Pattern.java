package com.microservice_systemdesign;

public class M28_Circuit_Breaker_Pattern {
    public static void main(String[] args) {

        String explanation = """
                -> The Circuit Breaker pattern protects a system from repeated failures.
                -> When a service keeps failing, it temporarily stops sending requests to that service,just
                   like a circuit breaker cutting power.
                -> This prevents the whole system from slowing down or crashing and lets the failed service recover.
                """;

        String howItWorks = """
                Circuit breaker has three states:
                
                Closed:
                -> Everything is working normally. All requests go through as usual.
                -> The breaker keeps an eye on failures and response times.
                
                Open:
                -> If failures cross a certain limit, for example, 5 failed requests in a row, the circuit “opens.”
                -> No more calls are made to the failing service.
                -> Instead, the system immediately returns a fallback response or a friendly error.
                
                Half-Open:
                -> After a short delay, the breaker allows a few test requests to see if the failing
                   service has recovered.
                -> If they succeed, the breaker closes again.
                   If they fail, it stays open for a while longer.
                """;
    }
}
