package com.microservices;

public class M32_Implementing_retry_In_Gateway {
    public static void main(String[] args) {

        String implementation = """
                
                -> Add a new filter after addResponseHeader:
                   .retry(retryConfig -> retryConfig.setRetries(3)
                   	.setMethods(HttpMethod.GET)
                   	.setBackoff(Duration.ofMillis(100),Duration.ofMillis(1000),2,true))
                """;
    }
}
