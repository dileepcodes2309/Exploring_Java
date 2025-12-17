package com.springscenario;

public class S02_Debug_SlowAPI {
    public static void main(String[] args) {
        /*
        Imagine there is an existing API but it takes too long to respond. How you debug it?
         */

        String answer = """
                First I will confirm that the API is really slow using Browser or Postman and measure
                the response time.
                If in browser it is slow, then it's a frontend issue and if it's slow in postman then
                it is a backend issue.
                
                We can use “curl -w” command to check the network latency
                
                We place loggers to check the server processing time.
                
                We place loggers at repository to check the DB processing time.
                
                If server processing is slow, we might need to optimize the code.
                
                If DB processing is slow, we need to optimize the query.
        
        
                This is how we debug the API.
                """;
    }
}
