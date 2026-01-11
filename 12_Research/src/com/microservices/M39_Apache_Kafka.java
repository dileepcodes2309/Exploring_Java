package com.microservices;

public class M39_Apache_Kafka {
    public static void main(String[] args) {

        String whatIs = """
                Apache Kafka is an open-source distributed event streaming platform.
                
                It is designed to handle large-scale, real-time data streams.
                
                Kafka supports high-throughput data processing.
                
                It is fault-tolerant, ensuring reliability even during failures.
                
                It is highly scalable, allowing systems to grow easily.
                
                Kafka is widely used to build real-time data streaming pipelines.
                
                It is also used to create applications that react to continuous data streams
                """;

        String coreComponents = """
              ->Producers
                Producers are applications that send (push) messages to Kafka.
                They publish messages to a Kafka topic.
                Examples: Order service, payment service, log producers.
              
              ->Kafka Cluster
                A Kafka cluster is a group of brokers working together.
                🔸 Broker
                A broker is a Kafka server.
                It stores data and serves read/write requests.
                 Multiple brokers ensure scalability and fault tolerance.
              
              ->Topics
                A topic is a logical channel or category where messages are sent.
                Example: orders, payments, notifications.
              
              ->Partitions
                Each topic is divided into partitions (P0, P1, …).
                Partitions allow:
                Parallel processing
                High throughput
                Messages inside a partition are ordered.
                Each message has an offset (0, 1, 2, …), which uniquely identifies it.
              
              ->Consumers
                Consumers pull messages from Kafka (Kafka does NOT push).
                They read messages from partitions using offsets.
              
               ->Consumer Groups
                A consumer group is a set of consumers working together.
                Each partition is consumed by only one consumer within a group.
                This provides:
                Load balancing
                Scalability
              """;
    }
}
