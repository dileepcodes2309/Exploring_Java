package com.microservices;

public class M29_Implementing_Cb_At_FeignClient {
    public static void main(String[] args) {

        String stepsToFollow = """
                -> Add below dependency in Microservice
                   		<dependency>
                   			<groupId>org.springframework.cloud</groupId>
                   			<artifactId>spring-cloud-starter-circuitbreaker-resilience4j</artifactId>
                   		</dependency>
                -> Add below property under spring
                cloud:
                    openfeign:
                      circuitbreaker:
                        enabled: true
                -> Add below property in yml file:
                   resilience4j.circuitbreaker:
                     configs:
                       default:
                         slidingWindowSize: 10
                         permittedNumberOfCallsInHalfOpenState: 2
                         failureRateThreshold: 50
                         waitDurationInOpenState: 10000
                -> Add a new class that implements the Feignlient interface
                -> Add fallback = CardsFallback.class in FeignClient interface
                """;
    }
}
