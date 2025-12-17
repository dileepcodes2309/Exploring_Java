package com.testing;

public class T02_UnitTest {
    public static void main(String[] args) {

        String meaning = """
                -> Testing a small piece of code is called unit test.
                """;

        String sampleCode = """
                
                Service Class
                package com.example.service;
                
                public class CalculatorService {
                
                    public int add(int a, int b) {
                        return a + b;
                    }
                }
                
                Test Class (JUnit 5)
                package com.example.service;
                
                import static org.junit.jupiter.api.Assertions.assertEquals;
                
                import org.junit.jupiter.api.BeforeEach;
                import org.junit.jupiter.api.Test;
                
                class CalculatorServiceTest {
                
                    private CalculatorService calculatorService;
                
                    @BeforeEach
                    void setUp() {
                        calculatorService = new CalculatorService();
                    }
                
                    @Test
                    void shouldReturnSumOfTwoNumbers() {
                        int result = calculatorService.add(2, 3);
                        assertEquals(5, result, "Addition of 2 and 3 should be 5");
                    }
                }
                
                """;

        String keyComponents = """
                Key points:
                
                Use @Test annotation to mark test methods.
                
                Assertions like assertEquals, assertTrue, etc., check the result.
                
                For Spring components, we often mock dependencies using Mockito.
                """;
    }
}
