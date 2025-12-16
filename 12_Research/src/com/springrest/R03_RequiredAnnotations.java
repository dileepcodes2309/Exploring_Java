package com.springrest;

public class R03_RequiredAnnotations {
    public static void main(String[] args) {

        String annotations = """
                @RestController: Marks the class as a REST controller (returns JSON/XML instead of views).
                
                @RequestMapping: Defines the base URL for all methods in the controller.
                
                @GetMapping, @PostMapping, @PutMapping, @PatchMapping, @DeleteMapping: HTTP-specific shortcuts for CRUD endpoints.
                
                @PathVariable: Extracts values from the URI path.
                
                @RequestParam: Extracts query parameters from the URL.
                
                @RequestBody: Maps the request JSON payload to a Java object.
                
                @ResponseEntity: Builds custom responses with status codes and headers.
                """;
    }
}
