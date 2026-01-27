package com.microservice_systemdesign;

public class M11_CQRS {

    String cqrs = """
            -> CQRS stands for Command Query Responsibility.
            -> It separates “writing data” from “reading data” into different models.
            """;

    String howItWorks = """
            CQRS splits your system into two paths:
            Command path → changes data
            Query path → reads data
            """;
}
