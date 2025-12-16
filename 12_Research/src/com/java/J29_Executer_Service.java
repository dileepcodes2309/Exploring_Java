package com.java;

public class J29_Executer_Service {
    public static void main(String[] args) {

        String executeService = """
                ->We need executer service to manage threads. It is just like a manager managing
                  all the employees under him.
                ->Instead of creating a new thread every time, we submit tasks to an executor,
                  and it runs them using a pool of threads behind the scenes.
                ->ExecutorService interface is part of the java.util.concurrent package
                """;

        String execute_vs_submit = """
                execute() runs a task but gives no result back.
                submit() runs a task and returns a Future .so we can get the result or catch exceptions.
                """;


    }
}
