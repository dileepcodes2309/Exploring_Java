package com.springscenario;

public class S03_Performance_Optimization {
    public static void main(String[] args) {
        /*
        You have found an API is very slow, and you need to optimize it,
        what are the steps you are going to take?
         */
        String performanceOptimization = """
                -> I first check for inefficient loops, especially filtering large datasets
                   in Java instead of the database.
                
                -> Avoid Creating Objects Inside Loops:
                   Creating unnecessary objects inside loops increases memory usage and GC pressure.
                
                -> Use asynchronous processing for long-running tasks to improve responsiveness.
                
                -> Implement caching to reduce database load and improve response times.
                
                -> For large datasets implement the pagination
                """;

    }
}
