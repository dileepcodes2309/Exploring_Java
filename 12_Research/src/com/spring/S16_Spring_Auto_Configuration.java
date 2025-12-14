package com.spring;

public class S16_Spring_Auto_Configuration {

    String whatIs = """
            Spring Boot Auto Configuration is like having a smart assistant that automatically sets up the
            Spring application based on what it detects in the project.
            """;

    String meaning = """
            -> When we add a dependency like Spring Web, Data JPA etc, springboot notices it
               and auto configure it tin Datasource.
            """;

    String howItWorks = """
            -> Springboot looks at the classpath and the beans we have defined.
            -> It checks what is missing.
            """;
}
