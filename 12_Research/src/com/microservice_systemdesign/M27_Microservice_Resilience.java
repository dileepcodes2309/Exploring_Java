package com.microservice_systemdesign;

public class M27_Microservice_Resilience {
    public static void main(String[] args) {

        String resilience = """
                -> Resilience is the ability of something to withstand or recover quickly from
                   difficulties or challenges.
                """;

        //how to achieve
        String circuitBreaker = """
                Stops calling a service that keeps failing and gives time to recover.
                For example if Payment service failing multiple times then the order service stops
                calling it temporarily.
                """;

        String retry = """
                Tries the same request again if it fails once due to a temporary issue, like a short network drop.
                """;

        String timeout = """
                Limits how long a service waits for another service’s response.
                """;

        String fallBack = """
                Provides a backup response when the main service fails.
                """;

        String bulkHead = """
                Separates services into isolated sections so one failure doesn’t overflow into others ,
                just like compartments in a ship.
                """;

        String healthChecks = """
                Continuously watch services to detect failures early and restart them automatically.
                """;
    }
}
