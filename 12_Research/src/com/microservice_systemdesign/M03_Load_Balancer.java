package com.microservice_systemdesign;

public class M03_Load_Balancer {

    public static void main(String[] args) {

        String loadBalancer = """
                -> In microservice system, we never rely on one instance of the service.
                -> If one service gets lots of traffics then it may gets slow or down. To avoid
                   this we run multiple instances of the same service.
                -> If one instance gets all the request then it may overloaded while others sits idle.
                -> Here the load balancer comes into picture, its task is to distribute the traffic equally
                   among all the instances.
                -> Load balancer sits between client and the microservices and play the role of
                   traffic manager.
                """;
    }
}
