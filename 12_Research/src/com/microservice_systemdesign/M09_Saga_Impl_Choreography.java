package com.microservice_systemdesign;

public class M09_Saga_Impl_Choreography {
    public static void main(String[] args) {

        String whatToDo = """
                -> Each service perform its local transaction and publish an event.
                -> And also listen to an event from previous service.
                
                Let's take a small food delivery example:
                Order Service:
                -> Creates order and publish an event ORDER_CREATED
                
                Payment Service:
                -> Listens to ORDER_CREATED
                -> Payment success → PAYMENT_COMPLETED
                -> Payment failed → PAYMENT_FAILED
                
                Inventory Service:
                -> Listens to PAYMENT_COMPLETED
                -> Reserves stock → STOCK_RESERVED
                
                Compensation:
                -> If payment fails:
                   Order Service listens to PAYMENT_FAILED
                   Marks order as CANCELLED
                """;
    }
}
