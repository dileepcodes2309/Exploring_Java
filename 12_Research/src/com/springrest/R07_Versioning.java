package com.springrest;

public class R07_Versioning {
    public static void main(String[] args) {

        String whatIsVersioning = """
                -> It is practice of introducing new changes but also keep the new old one working.
                """;

        String howToAchieve = """
                -> URL Versioning: Adding a version number to the API endpoint (e.g., /api/v1/resource).
                -> Query Parameter Versioning: Specifying the version as a query parameter
                -> Header Versioning: Sending the version information in a custom header (e.g., X-API-Version: 1).
                """;
    }
}
