import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calc.multiply(3, 5), "3 * 5 should equal 15");
    }

    @Test
    void testAssertTrueAndFalse() {
        assertTrue(calc.multiply(2, 3) == 6, "2 * 3 should be 6");
        assertFalse(calc.subtract(2, 3) == 5, "2 - 3 should not be 5");
    }

    @Test
    void testNotNullAndNull() {
        assertNotNull(calc.getMessage(), "Message should not be null");
        assertNull(calc.returnNull(), "Should return null");
    }
}


