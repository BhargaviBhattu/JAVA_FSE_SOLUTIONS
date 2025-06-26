import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setup() {
        System.out.println(" Setting up before each test...");
        calc = new Calculator();  // Arrange
    }

    @AfterEach
    void teardown() {
        System.out.println(" Cleaning up after each test...");
        calc = null;
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println(" All tests completed — global teardown");
    }

    @Test
    void testAddition() {
        // Act
        int result = calc.add(2, 3);

        // Assert
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction() {
        // Act
        int result = calc.subtract(10, 4);

        // Assert
        assertEquals(6, result, "10 - 4 should equal 6");
    }

    @Test
    void testMultiplication() {
        // Act
        int result = calc.multiply(4, 5);

        // Assert
        assertEquals(20, result, "4 * 5 should equal 20");
    }
}
