package com.microservices;

public class M09_JarName_Modify {
    public static void main(String[] args) {
        //add below line in pom file
        String customJarName = """
                <finalName>cards</finalName>
                """;
    }
}
