package com.spring;

public class S07_DI_vs_IOC {
    public static void main(String[] args) {

        String ioc = """
                -> IOC is a principle.
                -> It means that control of object creation and object life cycle is given to 
                   Spring container.
                -> The programmer does not create objects manually
                Q.Who creates and manages objects? 
                Ans: Spring container
                """;

        String di = """
                -> It is a design pattern.
                -> It is the way to achieve ioc.
                -> Dependencies are injected into a class instead of being created inside it.
                👉 How does Spring provide objects?
                Answer: By injecting dependencies
                """;
    }
}
