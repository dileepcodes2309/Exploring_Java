package com.microservice_systemdesign;

public class M04_Load_balancer_Types {
    public static void main(String[] args) {

        String clientSideLB = """
                -> Client will decide which instance of service to invoke.
                -> Client maintains list of available resources provided by service registry and
                   distribute the requests using a rule like Round Robin.
                
                   Calling Service > chooses instance ? calls target service
                """;

        String serverSideLB = """
                -> Here, client will not decide which service to invoke.
                -> It sends the request to load balancer or API gateway and that component will
                   forward the request to one of the service instances.
                
                   Client > API Gateway > service instance
                """;
    }
}
