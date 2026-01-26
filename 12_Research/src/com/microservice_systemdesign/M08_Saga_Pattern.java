package com.microservice_systemdesign;

public class M08_Saga_Pattern {

    public static void main(String[] args) {

        String explanation = """
                -> Saga pattern helps to manage transactions across multiple services.
                
                Example:
                Think about an online food delivery app.
                When we place an order, three services are involved:
                
                Order Service
                Payment Service
                Delivery Service
                
                First, the Order service creates the order in its database. Then it calls the Payment
                service to process the payment.
                After payment is successful, it calls the Delivery service to arrange delivery.
                
                If payment fails, Saga pattern calls a compensation step in the Order service to cancel
                the order.
                This way, we do not keep half-done work in the system.
                """;
    }
}
