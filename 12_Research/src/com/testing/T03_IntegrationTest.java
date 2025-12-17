package com.testing;

public class T03_IntegrationTest {
    public static void main(String[] args) {

        String integrationTesting = """
                Integration testing checks how layers work together, like Controller > Service > Repository > Database.
                """;

        String sampleCode = """
                @SpringBootTest
                @AutoConfigureMockMvc
                class UserControllerTest {
                
                    @Autowired
                    private MockMvc mockMvc;
                
                    @Test
                    void shouldReturnUserWhenUserExists() throws Exception {
                        mockMvc.perform(get("/users/1"))
                               .andExpect(status().isOk())
                               .andExpect(jsonPath("$.name").value("John"));
                    }
                }
                """;
    }
}
