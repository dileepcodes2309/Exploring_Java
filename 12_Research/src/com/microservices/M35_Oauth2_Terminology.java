package com.microservices;

public class M35_Oauth2_Terminology {
    public static void main(String[] args) {

        String resourceOwner = """
                -> It is the end user who owns the data.
                """;

        String client = """
                -> The website, the mobile app or API will be the client that interacts with Github
                   services on behalf of the resource owner/end user . In the scenario of Stackoverflow,
                   the stackoverflow website is the client.
                """;

        String authorizationServer = """
                -> This is the server which knows about the resource owner. In other words resource owner
                   should have account on this server. In the scenario of stackoverflow, the Github server
                   which has authorization logic acts as Authorization server.
                """;

        String scope = """
                -> Scope defines the level of access given to a client application by an authorization server.
                """;
    }
}
