package com.microservices;

public class M22_Service_Discovery_Using_Eureka {
    public static void main(String[] args) {

        String stepsToFollow = """
                -> Create a new microservice having below dependency:
                   Eureka Server
                   Config Client
                   Springboot Actuator
                
                -> Add @EnableEurekaServer annotation in main class.
                -> Add below property in eurekaserver.yml
                   eureka:
                     instance:
                       hostname: "localhost"
                     client:
                       fetchRegistry: false
                       registerWithEureka: false
                       serviceUrl:
                         defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
                -> Eureka Server is accessible at http://localhost:8070/
                """;

        String changesInMicroservice = """
                -> Add Eureka Discovery Client in the microservice.
                -> Add below changes in application.yml
                   eureka:
                     instance:
                       preferIpAddress: true
                     client:
                       fetchRegistry: true
                       registerWithEureka: true
                       serviceUrl:
                         defaultZone: http://localhost:8070/eureka/
                
                   info:
                     app:
                       name: "accounts"
                       description: "account-ms"
                       version: "1.0.0"
                
                -> Enable info related property under management:
                       info:
                         env:
                           enabled: true
                -> Enable shutdown actuator:
                   endpoint:
                       shutdown:
                         access: unrestricted
                -> 
                """;
    }
}
