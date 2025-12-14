package com.spring;

public class S22_Circular_Dependencies_Resolving {
    public static void main(String[] args) {

        String meaning = """
                A circular dependency happens when two (or more) beans depend on each other to get created.
                """;

        String howToResolve = """
                1.Using Lazy Injection:
                Lazy tells Spring: “don’t create this bean immediately, create it only when needed.”
                This breaks the cycle because Spring can first create one bean and keep a proxy for the other.
                
                2.Setter or Field Injection
                But if we use a setter, Spring can first create the object and later “inject” the dependency.
                This way, Spring can create A without needing B instantly.
                
                3.Refactor the design
                It is the best approach
                Example: Instead of having A depend on B and B depend on A, write a third-class ‘C’ 
                and move shared logic , and both A & B classes depend on C.
                """;
    }
}
