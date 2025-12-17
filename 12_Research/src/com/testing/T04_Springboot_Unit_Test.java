package com.testing;

public class T04_Springboot_Unit_Test {

    public static void main(String[] args) {

        String explanation = """
                Performing unit testing in Spring Boot usually involves JUnit 5 and Mockito.
                The idea is to test only one class at a time while mocking out its dependencies.
                """;

        String sampleCode = """
                @SpringBootTest
                class UserServiceTest {
                
                    @MockBean
                    private UserRepository userRepository;
                
                    @Autowired
                    private UserService userService;
                
                    @Test
                    void shouldReturnUserByIdWhenUserExists() {
                        // Arrange
                        when(userRepository.findById(1L))
                                .thenReturn(Optional.of(new User(1L, "John")));
                
                        // Act
                        User user = userService.getUser(1L);
                
                        // Assert
                        assertEquals("John", user.getName());
                    }
                }
                """;
    }
}
