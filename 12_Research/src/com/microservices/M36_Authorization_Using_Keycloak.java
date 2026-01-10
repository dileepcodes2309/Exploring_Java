package com.microservices;

public class M36_Authorization_Using_Keycloak {
    public static void main(String[] args) {

        String stepsToFollow = """
                -> Navigate to Keycloak website.
                -> Go to getting started with Docker
                -> Execute below command
                docker run -d -p 127.0.0.1:7080:8080 -e KC_BOOTSTRAP_ADMIN_USERNAME=admin -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:26.5.0 start-dev
                -> Try to access http://localhost:7080/
                -> Create a client
                -> Enable client authentication
                -> Disable standard flow and Direct access grants.
                -> Enable Service account roles
                -> Under realm setting, you will find Endpoint
                   Hit below URL:
                   http://localhost:7080/realms/master/protocol/openid-connect/token as post
                   Provide client id and secret code to get access token.
                -> We will get a access token.
                """;
    }
}
