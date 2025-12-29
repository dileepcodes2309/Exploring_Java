package com.microservices;

public class M13_Spring_Profiles {
    public static void main(String[] args) {

        String meaning = """
                Spring Profiles let you run the same Spring Boot application with different configurations
                based on the environment (dev, test, qa, prod, etc.).
                """;

        String stepsToFollow = """
                -> Create two more property files as application_qa.yml and application_prod.yml
                   and add below property into it.
                   spring:
                     config:
                      activate:
                        on-profile: "qa"
                
                -> In application.yml, add below property.
                   spring:
                     config:
                       import:
                         - "application_qa.yml"
                         - "application_prod.yml"
                     profiles:
                       active:
                         - "qa"
                """;

    }
}
