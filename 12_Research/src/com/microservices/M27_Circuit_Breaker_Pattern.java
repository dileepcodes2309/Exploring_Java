package com.microservices;

public class M27_Circuit_Breaker_Pattern {
    public static void main(String[] args) {

        String whatIs = """
                -> A safety mechanism in microservices.
                -> Prevents calling a failed or slow service again and again
                -> Keeps your system alive and fast
                """;

        String whyWeNeedIt = """
                -> One microservice failure can crash others.
                -> Continuous retries cause:
                
                   Thread exhaustion
                
                   High latency
                
                   System downtime
                -> Circuit Breaker stops the damage
                """;

        String whereWeUse = """
                -> Between Gateway → Microservice.
                -> Between Service → Service.
                -> When calling external APIs.
                """;

        String whatProblemSolve = """
                -> Prevents cascading failures.
                -> Avoids waiting on timeouts.
                -> Returns response immediately
                """;

        String threeStages = """
                Circuit Breaker has 3 states
                🟢 CLOSED
                Everything works
                Requests are allowed
                Failures are monitored
                
                🔴 OPEN
                Service is failing
                Requests are blocked
                Fallback response is returned
                
                🟡 HALF-OPEN
                After some wait time
                Allows few test requests
                Decides recovery or failure
                """;

        String fallBack = """
                Alternative response when service fails
                Example:
                “Service unavailable, try later”
                """;

        String afterWaitTime = """
                Circuit goes to HALF-OPEN
                Sends test request
                Success → CLOSED
                Failure → OPEN again
                """;
    }
}
