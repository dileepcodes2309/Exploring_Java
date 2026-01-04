package com.microservices;

public class M28_Implementing_CB_At_Gatewayserver {
    public static void main(String[] args) {

        String stepsToFollow = """
                -> Add below dependency in pom file
                <dependency>
                	<groupId>org.springframework.cloud</groupId>
                	<artifactId>spring-cloud-starter-circuitbreaker-reactor-resilience4j</artifactId>
                </dependency>
                
                -> .circuitBreaker(config -> config.setName("accountsCircuitBreaker"))
                -> Add below property in yml file
                   resilience4j.circuitbreaker:
                     configs:
                       default:
                         slidingWindowSize: 10
                         permittedNumberOfCallsInHalfOpenState: 2
                         failureRateThreshold: 50
                         waitDurationInOpenState: 10000
                ->
                """;

        String creatingFallbackMechanism = """
                -> Create a new controller inside Gatewayserver application.
                -> Add below property in main class just after circuitBreaker
                -> .setFallbackUri("forward:/contactSupport")
                """;
    }
}
