package com.spring;

public class S20_POJO_vs_DTO {

    String pojo = """
            -> It stands for Plain Old Java Object.
            -> It is a simple Java class that contains data and might contain business logic also.
            """;

    String dto = """
            -> A DTO is a light wight object which is used to carry data between different layers.
            """;

    /*
    How they differ
    POJO has everything: id, password, timestamps, business rules.
    DTO is trimmed down: only what the client needs (name + email).
     */
}
