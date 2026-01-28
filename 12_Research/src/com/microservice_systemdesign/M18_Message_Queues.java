package com.microservice_systemdesign;

public class M18_Message_Queues {
    public static void main(String[] args) {

        String messageQueues = """
                -> A message queue is a system where services can send messages to each other without
                   waiting.
                -> Messages are stored in a queue until the receiving service is ready to process them.
                """;

        String howItWorks = """
                Producer: The service that sends the message
                Example : Customers submitting tickets act as the producer.
                
                Queue: The storage place where the messages will wait.
                Example: The ticket system is the queue. Tickets will wait here until an agent is available/
                
                Consumer: The service that reads the message.
                The support agents are consumers. Each agent picks a ticket from the queue and resolves it.
                
                Broker/Queue Manager:
                The software or service that manages the message queue, handles the delivery of
                messages, and ensures that messages are routed correctly between producers and
                consumers.
                
                Acknowledgment: The consumer tells the queue the message is processed.
                Once an agent finishes resolving a ticket, the message is removed from the queue.
                """;

        String example = """
                AWS SQS, RabbitMQ & Kafka, IBM MQ
                """;
    }
}
