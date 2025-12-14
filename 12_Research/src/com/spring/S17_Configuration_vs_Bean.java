package com.spring;

public class S17_Configuration_vs_Bean {
    public static void main(String[] args) {

        String configuration = """
                -> It is a class level annotation.
                -> When a class is annotated with @Configuration, springboot treats as
                   source of bean definition and manage it as full spring configuration.
                """;

        String bean = """
                -> It is a method level annotation.
                -> It tells the spring that the object returned by this method should be treated as
                   bean in the Spring context.
                """;
    }
}
