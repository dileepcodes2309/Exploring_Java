package com.microservices;

public class M24_EdgeServer {
    public static void main(String[] args) {

        String gatewayServer = """
                -> Create a new project with Reactive Gateway maven dependency.
                -> Add below property in gatewayserver.yml:
                   server:
                     port: 8072
                
                   eureka:
                     instance:
                       preferIpAddress: true
                     client:
                       registerWithEureka: true
                       fetchRegistry: true
                       serviceUrl:
                         defaultZone: "http://localhost:8761/eureka/"
                
                -> Add below property in application.yml
                   spring:
                     application:
                       name: "gatewayserver"
                     config:
                       import: "optional:configserver:http://localhost:8071/"
                     cloud:
                       gateway:
                         server:
                           webflux:
                             discovery:
                               locator:
                                 enabled: true
                                 lowerCaseServiceId: true
                
                
               
                """;
    }
}
