package com.microservices;

public class M26_CustomHeader {
    public static void main(String[] args) {

        String whatToDo = """
                Add below filter
                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
                """;
    }
}
