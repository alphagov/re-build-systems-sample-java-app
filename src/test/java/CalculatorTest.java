import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void shouldAddTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}
