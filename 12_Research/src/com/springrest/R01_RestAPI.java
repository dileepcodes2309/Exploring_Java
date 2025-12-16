package com.springrest;

public class R01_RestAPI {
    public static void main(String[] args) {

        String restAPI = """
                -> REST API is a way for two systems to talk to each other using a set of rules.
                -> To exchange data between two systems, REST relies on HTTP methods like GET,
                   POST,PUT/PATCH,DELETE.
                -> The data is usually sent in formats like JSON or XML.
                """;

        String stateless = """
                -> Stateless means every request must contains all the info and the server does not
                   remember past interaction.
                """;

        String stateful = """
                -> Stateless means that the server stores the session data about the client, so requests
                   rely on server's memory of previous call.
                """;
    }
}
