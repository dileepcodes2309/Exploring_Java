package com.microservices;

public class M37_Security_Inside_Gatewayserver {
    public static void main(String[] args) {

        String stepsToFollow = """
                -> Add Spring security, Oauth and jwt related dependencies.
                -> Add below property inside yml under spring
                   security:
                       oauth2:
                         resourceserver:
                           jwt:
                             jwk-set-uri: "http://localhost:7080/realms/master/protocol/openid-connect/certs"
                
                
                """;
    }
}
