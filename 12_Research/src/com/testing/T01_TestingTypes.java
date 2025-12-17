package com.testing;

public class T01_TestingTypes {
    public static void main(String[] args) {

        String unitTest = """
                -> Testing individual method or class in isolation is called unit testing.
                -> Example: testing a service method that calculates discount.
                """;

        String integrationTesting = """
                
                -> Testing how multiple components work together.
                -> Example: making sure the Spring Service talks correctly to a Repository and database.
                """;

        String functionalTesting = """
                -> Testing the actual flow from API layer to DB.
                -> Example: hitting a REST endpoint and checking the full response.
                """;

    }
}
