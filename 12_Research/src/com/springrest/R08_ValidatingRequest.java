package com.springrest;

public class R08_ValidatingRequest {
    public static void main(String[] args) {

        String validation = """
                -> Spring Boot provides a clean way to handle validation using annotations,
                   binding, and exception handling.
                -> Annotations – to declare validation rules.
                -> Binding – to map request data to Java objects.
                -> Exception handling – to handle validation errors in one place
                """;

        String handlingValidation = """
                ->To trigger a validation automatically we need to use the @Valid annotation on the
                  controller method.
                ->@Valid tells the spring to check the DTO annotations.
                ->If the request is invalid, Spring throws a MethodArgumentNotValidException.
                ->We can handle errors gracefully using @ControllerAdvice.
        
        This way, we can send a clear message about what went wrong instead of a generic server error.
        """;
    }
}
