package com.microservices;

public class M19_Refreshing_Properties_InRuntime_Actuator {
    public static void main(String[] args) {

        String howToDo = """
                Add below properties in yml file:
                management:
                  endpoints:
                    web:
                      exposure:
                        include: "*"
                
                -> Hit this url to reflect the changes:-http://localhost:8080/api/contact-info
                """;
    }
}
