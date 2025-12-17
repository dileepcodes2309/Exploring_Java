package com.springrest;

public class R04_Controller_vs_RestController {
    public static void main(String[] args) {

        String controller = """
                
                -> It is stereotype annotation.
                -> It marks class web request handler.
                -> It is used to declare common web controllers that can return HTTP responses.
                -> @Controller typically returns view names (HTML/JSP)
                -> To return JSON from @Controller, we must use @ResponseBody.
                """;

        String restController = """
                -> It is the combination @Controller + @ResponseBody.
                -> It is used to create controllers for REST APIs that can return JSON responses.
                -> Every method automatically returns JSON/XML instead of a view.
                """;

        String pointToRemember = """
                -> If we use both @Controller and @RestController, it will not break
                   anything, and spring will treat as RestController.
                """;
    }
}
