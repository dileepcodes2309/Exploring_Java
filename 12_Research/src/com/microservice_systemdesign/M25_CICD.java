package com.microservice_systemdesign;

public class M25_CICD {
    public static void main(String[] args) {

        String hwyWeNeed = """
                -> Continuous Integration and Continuous Development plays a very important
                   role in microservices because they are small, independent and often changes.
                """;

        String roleOfCI = """
                -> When developer updates a new microservice, the CI pipeline automatically pulls new code,
                   runs unit tests, runs integration tests and build a fresh service image.
                -> If anything fails, CI stops the process tells us what ius broken.
                """;

        String roleOfCD = """
                -> Once CI tests pass, CD creates a new version of the microservice.
                -> It deploys into production.
                -> It updates the service in Kubernetes or any target environment.
                -> It verifies that the service is running correctly
                """;

        //In simple words: CI tests the change; CD delivers the change.
    }
}
