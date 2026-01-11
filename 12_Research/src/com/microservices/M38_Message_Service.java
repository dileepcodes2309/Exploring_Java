package com.microservices;

public class M38_Message_Service {
    public static void main(String[] args) {

        String creation = """
                -> Create a new project
                -> Add new dependency Function
                        <dependency>
                			<groupId>org.springframework.cloud</groupId>
                			<artifactId>spring-cloud-stream</artifactId>
                		</dependency>
                		<dependency>
                			<groupId>org.springframework.cloud</groupId>
                			<artifactId>spring-cloud-stream-binder-rabbit</artifactId>
                		</dependency>
                -> Add below property in application.yml
                   cloud:
                       function:
                         definition: email|sms
                       stream:
                         bindings:
                           emailsms-in-0:
                             destination: send-communication
                             group: ${spring.application.name}
                           emailsms-out-0:
                             destination: communication-sent
                     rabbitmq:
                       host: localhost
                       port: 5672
                       username: guest
                       password: guest
                       connection-timeout: 10s
                
                -> Add above dependency in microservice
                """;

        String rabbitMq = """
                # latest RabbitMQ 4.x
                docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4-management
                """;
    }
}
