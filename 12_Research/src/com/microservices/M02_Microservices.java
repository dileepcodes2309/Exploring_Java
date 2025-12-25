package com.microservices;

public class M02_Microservices {
    public static void main(String[] args) {

        String explanation = """
                -> Microservices is one of the architectural style available that we can
                   consider for building a web application.
                -> Microservices are independent services designed around business domains and deployed separately.
                """;

        String formalDefinition = """
                ->Microservices is an approach to building a single application as a collection of small services
                  Each service:
                ->Runs in its own process
                ->Is independently deployable
                ->Services communicate using lightweight mechanisms (such as REST or messaging)
                ->Each service is designed around a specific business capability
                ->Deployment is handled through fully automated deployment pipelines
                """;
    }
}
