package com.microservice_systemdesign;

public class M10_Saga_Impl_Orchestration {
    public static void main(String[] args) {

        String stepsToFollow = """
                -> one service acts like a controller. It tells each service what to do next.
                
                Using the same food delivery example:
                -> The Saga Orchestrator calls Order service to create the order.
                -> Then it calls Payment service to complete the payment.
                -> Then it calls Delivery service to arrange the delivery.
                -> If payment fails, the Orchestrator calls Order service to cancel the order.
                """;
    }
}
