package com.spring;

public class S11_DI_Types {
    public static void main(String[] args) {

        String diTypes = """
                -> There are three types of Dependency injection:
                Constructor Injection
                Setter Injection
                Field Injection
                """;

        String constructionInjection = """
                We pass dependencies using class constructor.
                """;

        String setterInjection = """
                Dependencies are passed through setter methods.
                """;

        String fieldInjection = """
                -> Dependency is directly injected into the field using @Autowired.
                -> It is very easy but not recommended for large projects since it makes
                   testing and refactoring harder.
                """;

        String whyConstructorInjection = """
                -> Constructor injection is recommended because it forces all required dependencies to be
                   provided when the object is created.
                -> The object is complete and stable from the beginning, and its dependencies can’t be changed later.
                """;

        //constructor injection is best practice because it makes the class immutable and easier to test.
    }
}
