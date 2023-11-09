package seminar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    FactorialCalculator factorialCalculator;
    @BeforeEach
    void setUp() {
        factorialCalculator = new FactorialCalculator();
    }

    @Test
    void calculateFactorialThrowsException() {
        int value = -1;
        assertThrows(IllegalArgumentException.class, () -> factorialCalculator.calculateFactorial(value));
    }

    @Test
    void calculateFactorialCheckResult(){
        assertEquals(120, factorialCalculator.calculateFactorial(5));
    }
}