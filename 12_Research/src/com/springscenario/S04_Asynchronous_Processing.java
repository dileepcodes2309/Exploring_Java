package com.springscenario;

public class S04_Asynchronous_Processing {
    public static void main(String[] args) {

        /*
        Suppose you need to a large number of data and save data in DB.
        It is very long-running task. How would you handle it?
         */

        String implementation = """
                This is where tools like Spring Batch or @Async with ExecutorService comes into picture.
                
                Spring Batch is built exactly for this kind of job like chunked reading, processing, and writing to DB.
                """;
    }
}
