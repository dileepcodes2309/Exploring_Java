package com.eight;

public class E01_Default {
    public static void main(String[] args) {

        String default_ = """
                -> Default methods allow us to add new method interface to the interface without
                   breaking the class that already implemented.
                """;

        String whyDefault = """
                ->Before Java 8, interfaces have only abstract methods, if we added a new method
                  the class who implements that interface class need to provide implementation or we 
                  will get compile-time error.
                
                ->In Java 8, they have introduced default methods.
                  We can add default methods in interface without breaking the class who already implemented
                  that class.
                
                ->We can also provide default implementation to default method.
                """;
    }
}
