package seminar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxFinderTest {
    static MaxFinder maxFinder;
    @BeforeEach
    void setUp() {
        maxFinder= new MaxFinder();
    }

    @Test
    void findMaxArrayIsEmpty() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> maxFinder.findMax(arr));
    }
    @Test
    void findMaxArrayReturnsMaxValue() {
        int[] arr = {1,2,4,5,23,99};
        assertEquals(99, maxFinder.findMax(arr));
    }
    // Тест с массивом из одного элемента
    @Test
    void findMaxArraySingleValue() {
        int[] arr2 = {5};
        int max2 = maxFinder.findMax(arr2);
        assertEquals(5, max2, "Максимум в массиве из одного элемента должен быть равен этому элементу");
    }
    // Тест с отрицательными числами
    @Test
    void findMaxArrayNegativeNumbers() {
        int[] arr3 = {-2, -5, -1, -7, -3};
        int max3 = maxFinder.findMax(arr3);
        assertEquals(-1, max3, "Максимум в массиве отрицательных чисел должен быть равен -1");
    }
}
