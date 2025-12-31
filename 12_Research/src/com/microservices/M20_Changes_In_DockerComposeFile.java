package com.microservices;

public class M20_Changes_In_DockerComposeFile {

    public static void main(String[] args) {
        String changes = """
                -> Add configserver service in docker-compose file.
                -> Add below property in it:
                       healthcheck:
                         test: "curl --fail --silent localhost:8071/actuator/health/readiness | grep UP || exit 1"
                         interval: 10s
                         timeout: 5s
                         retries: 10
                         start_period: 10s
                -> Add below property in other service:
                       depends_on:
                         configserver:
                           condition: service_healthy
                -> Add Environment property also
                   environment:
                    SPRING_CONFIG_IMPORT: "configserver:http://configserver:8071/"
                    SPRING_PROFILES_ACTIVE: "qa"
                    SPRING_APPLICATION_NAME: "accounts"
                """;
    }
}
