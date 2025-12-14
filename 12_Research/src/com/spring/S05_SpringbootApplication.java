package com.spring;

public class S05_SpringbootApplication {

    public static void main(String[] args) {

        String springbootApplication = """
                It is a combination of 3 annotations:
                -> @EnableAutoConfiguration
                -> @ComponentScan
                -> @Configuration
                """;

        String EnableAutoConfiguration = """
                -> It Automatically configures beans depending on what's on the classpath.
                """;

        String componentScan = """
                -> It scan all the classes annotate with stereotype annotations.
                """;

        String configuration = """
                -> This annotation configures the bean and packages in the classpath.
                """;
    }
}
