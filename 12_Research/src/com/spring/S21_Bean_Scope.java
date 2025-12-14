package com.spring;

public class S21_Bean_Scope {
    public static void main(String[] args) {

        String beanScope = """
                Bean scope defines the lifecycle and visibility of a Spring bean, i.e.:
                
                👉 How many objects of a bean Spring creates
                👉 How long the bean lives
                👉 Where the bean is available
                """;

        String scopeType = """
                1️⃣ Singleton
                One instance per Spring container
                Default scope
                Used for services, repositories
                
                2️⃣ Prototype
                A new object every time the bean is requested
                
                3️⃣ Request (Web Only)
                One bean per HTTP request
                
                4️⃣ Session (Web Only)
                One bean per HTTP session
                
                5️⃣ Application
                One bean per ServletContext
                Shared across all sessions
                """;

        String explanation = """
                Bean scope defines the lifecycle and visibility of a bean in Spring, determining 
                how many instances are created and how long they exist. The default scope is singleton.
                """;
    }
}
