package com.spring;

public class S02_EmbeddedContainers {
    public static void main(String[] args) {

        String traditionalApproach = """
                -> Before springboot, we packaged applications as WAR.
                -> Then we deploy that WAR file into embedded server.
                -> For this, we need to install server separately.
                """;

        String springbootApproach = """
                -> But now springboot comes up with embedded server.
                -> The server runs inside the application.
                -> Application is packaged as a JAR.
                -> When we run the JAR, application starts and embedded starts automatically.
                """;

    }
}
