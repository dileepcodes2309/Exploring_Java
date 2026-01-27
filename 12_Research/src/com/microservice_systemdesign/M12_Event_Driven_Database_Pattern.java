package com.microservice_systemdesign;

public class M12_Event_Driven_Database_Pattern {
    public static void main(String[] args) {

        String purpose = """
                -> Event-Driven Database Pattern is a way to keep different microservices in sync using events
                   instead of direct database calls.
                -> Instead of one service updating another service’s database directly, a
                   service publishes an event whenever its data changes.
                -> Other services listen to these events and update their own databases accordingly.
                """;

        String example = """
                -> Example: Food Delivery System
                Restaurant Service: manages restaurant menus and availability
                Delivery Service: assigns delivery partners to active orders
                
                When a restaurant temporarily stops taking orders
                -> Restaurant Service updates its status in its own database.
                -> It publishes a RestaurantUnavailable event.
                -> Delivery Service listens to this event and removes the restaurant from its list of
                 assignable options.
                """;
    }
}
