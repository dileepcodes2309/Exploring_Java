package com.microservice_systemdesign;

public class M17_Kafka_Architecture {
    public static void main(String[] args) {

        String whatIsKafka = """
                -> Kafka is a message broker that stores messages allow multiple services to read those
                   messages asynchronously.
                """;

        String kafkaComponents = """
                Kafka has four main components: Producer, Topic, Broker and Consumer.
                """;

        String Producer = """
                -> Sends messages to Kafka
                   Example: Order Service
                """;

        String Topic = """
                -> A category / channel of messages
                   Like a folder or WhatsApp group
                """;

        String Consumer = """
                -> Reads messages from Kafka
                   Example: Payment Service, Email Service
                """;

        String Broker = """
                -> Kafka server that stores messages
                   Kafka cluster = multiple brokers
                """;
    }
}
