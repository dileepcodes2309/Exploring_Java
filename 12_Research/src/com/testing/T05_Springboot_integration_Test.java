package com.testing;

public class T05_Springboot_integration_Test {
    public static void main(String[] args) {

        String meaning = """
                Integration testing in Spring Boot is all about verifying how different
                layers of the application work together.
                """;

        /*
        For example, suppose we have a UserController that talks to a UserService,
        which in turn talks to a UserRepository. An integration test makes sure that the flow
        works correctly end to end. In Spring Boot, the simplest way to do this is with @SpringBootTest.
        This annotation starts the entire application context and allows us to send HTTP requests to the
        controllers using MockMvc or TestRestTemplate.
         */

        String sampleCode = """
                @SpringBootTest  // Loads the full application context
                @AutoConfigureMockMvc  // Configures and injects MockMvc
                class UserControllerIT {
                
                    @Autowired
                    private MockMvc mockMvc;
                
                    @Test
                    void shouldReturnUserById() throws Exception {
                        mockMvc.perform(get("/users/1"))
                               .andExpect(status().isOk())
                               .andExpect(jsonPath("$.name").value("John"));
                    }
                }
                
                """;
    }
}
