package com.spring;

public class S10_SpringbootStarter {
    public static void main(String[] args) {

        String explanation = """
                -> Spring Boot starters are preconfigured dependency bundles that simplify adding 
                   features to a Spring Boot application.
                -> Instead of adding many individual dependencies manually, we add one starter dependency, 
                   and Spring Boot pulls in everything required.
                """;

        String example = """
             ->  Without Starter (Traditional Way)
             
                We would need to add dependencies manually:
                
                Spring MVC
                
                Tomcat
                
                Jackson (JSON)
                
                Validation libraries
                
                Logging libraries
                
             ->With Starter (Spring Boot Way)
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-web</artifactId>
                </dependency>
                
                
                This single starter includes:
                
                Spring MVC
                
                Embedded Tomcat
                
                Jackson (JSON processing)
                
                Validation
                
                Logging
                """;
    }
}
