package seminar2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenCheckerTest {
    EvenChecker evenChecker;
    @BeforeEach
    void initClass(){

        evenChecker = new EvenChecker();
    }
    @Test
    void isEvenWithEvenNumber() {
        assertTrue(evenChecker.isEven(2));
    }
    @Test
    void isEvenWithOddNumber() {
        assertFalse(evenChecker.isEven(3));
    }
}
