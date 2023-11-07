package task1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTest {

    @BeforeEach
    public void setup() {
        // Инициализация ресурсов
    }

    @AfterEach
    public void teardown() {
        // Очистка ресурсов
    }

    @BeforeAll
    public static void globalSetup() {
        // Инициализация
    }

    @AfterAll
    public static void globalTeardown() {
        // Очистка
    }

    @Test
    public void testMethod() {
        assertEquals(5, 2 + 3);
    }

    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        assertEquals(5, 2 + 3);
    }

//    @Test
//    @Disabled
//    public void testMethod() {
//        // этот тест не будет запущен
//    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testMethod2(int argument) {
        assertTrue(argument > 0);
    }

}