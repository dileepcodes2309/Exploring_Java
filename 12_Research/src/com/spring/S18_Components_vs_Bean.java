package com.spring;

public class S18_Components_vs_Bean {
    public static void main(String[] args) {
        String component = """
                -> It is a class level annotation.
                -> If we put this annotation on top of a class and that class is inside a package that Spring
                   scans, Spring will automatically create an object of it and manage it as a bean.
                """;

        String bean = """
                -> @Bean is a method-level annotation.
                -> @Bean is more like the “manual way.”
                -> We use it inside a class annotated with @Configuration.
                """;
    }
}
