package com.springscenario;

public class S09_Monitoring_Springboot_Application {
    public static void main(String[] args) {
        /*
        Your application is in production, and you need to monitor its health, metrics,
        and logs to ensure it is performing optimally.
         */

        String explanation = """
                -> Spring Boot Actuator provides a powerful set of tools for monitoring and managing applications.
                
                Enable Actuator Endpoints: management.endpoints.web.exposure.include=*
                Access Actuator Endpoints.
                
                Health Check: http://localhost:8080/actuator/health
                
                Metrics: http://localhost:8080/actuator/metrics
                
                Environment: http://localhost:8080/actuator/env
                
                We can also integrate with external monitoring tools like Prometheus and Grafana
                for more advanced monitoring capabilities.
                """;
    }
}
