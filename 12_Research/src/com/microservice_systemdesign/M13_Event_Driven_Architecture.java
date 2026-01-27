package com.microservice_systemdesign;

public class M13_Event_Driven_Architecture {
    public static void main(String[] args) {

        String purpose = """
                -> It is a way to design a system where services will communicate with each other by
                   sending and reacting to an event.
                -> Instead of calling each other directly, services produce events when
                   something happens, and other services listen for those events and act accordingly.
                """;

        String example = """
                Imagine a riding app like a taxi service:
                
                -> Booking Service: When a customer requests a ride, it creates a RideRequested event.
                -> Driver Service: Listens to RideRequested events and finds a nearby driver.
                -> Notification Service: Listens to the same event to send a message to the customer: “Driver is on
                   the way.”
                -> Billing Service: Listens to RideRequested and calculates the estimated fare.
                """;

        // We use Kafka, RabbitMQ or Amazon SQS for publishing and consuming the events.
    }
}
