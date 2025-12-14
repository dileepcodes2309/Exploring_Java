package com.spring;

public class S01_Springboot {
    public static void main(String[] args) {

        String whatIs = """
                Springboot is built on top of the Spring that simplifies application development
                by providing auto-configuration, embedded servers and starter dependencies, allowing
                developers to focus only on business logic.
                """;

        String creatingNonWebApplication = """
                ->We can create non web applications using springboot.
                ->To build a non web applications, we have to exclude web starter dependencies.
                ->We use ApplicationRunner or CommandLineRunner to run application at start up.
                """;
    }
}
