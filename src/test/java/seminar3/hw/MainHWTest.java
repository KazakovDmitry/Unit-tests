package seminar3.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    MainHW sample;

    @BeforeEach
    void setUp() {
        sample = new MainHW();
    }

    @Test
    @DisplayName("Проверка на чётность чётного числа")
    void evenOddNumberWithEven() {
        assertTrue(sample.evenOddNumber(2));
    }

    @Test
    @DisplayName("Проверка на чётность нечётного числа")
    void evenOddNumberWithOdd() {
        assertFalse(sample.evenOddNumber(3));
    }

    @Test
    @DisplayName("Проверка вхождения числа в интервал от 25 до 100")
    void numberInIntervalInclude() {
        assertTrue(sample.numberInInterval(50));
    }

    @Test
    @DisplayName("Проверка вхождения числа ВНЕ интервала от 25 до 100")
    void numberInIntervalNotInclude() {
        assertFalse(sample.numberInInterval(5));
    }
}