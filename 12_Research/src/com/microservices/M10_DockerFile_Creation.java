package com.microservices;

public class M10_DockerFile_Creation {
    public static void main(String[] args) {

        //Steps to follow
        String dockerFile = """
                -> Create a file named as Dockerfile.
                -> Inside dockerfile we write instructions that can be used to
                   create docker image.
                
                """;

        String dockerFileInfo = """
                #Start with a base image containning JAVA runtime
                FROM eclipse-temurin:17-jdk-jammy
                
                #Information around who manage the image
                LABEL "org.opencontainers.image.authors"="dileep"
                
                #Add application's jar to the image
                COPY target/accounts.jar accounts.jar
                
                #execute the application
                ENTRYPOINT["java","-jar","accounts.jar"]
                """;

        String dockerBuildCommand = """
                docker build . -t dileep2309/loans:d3
                """;

        String dockerContainerCreation = """
                -> docker run -d -p 8080:8080 dileep2309/accounts:d29
                """;
    }
}
