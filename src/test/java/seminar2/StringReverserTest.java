package seminar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {
    StringReverser stringReverser;
    @BeforeEach
    void setUp() {
        stringReverser = new StringReverser();
    }

    @Test
    void reverse() {
        String value = "findMaxArray";
        String valueReversed = "yarrAxaMdnif";
        assertEquals(valueReversed, stringReverser.reverse(value));
    }
    @Test
    void reverseEmptyString() {
        String value = "";
        String valueReversed = "";
        assertEquals(valueReversed, stringReverser.reverse(value));
    }
    @Test
    void reverseNPE() {
        String value = null;
        assertThrows(NullPointerException.class, () -> stringReverser.reverse(value));

    }
}
