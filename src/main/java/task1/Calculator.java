package task1;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    /**
     * Метод вычисляет сумму покупки с учетом скидки
     * @param a любое целое число
     * @param b процент скидки от 0 до 100
     * @return
     */
    public double calculateDiscount(int a, int b) {
        if (b < 0 || b > 100) {
            throw new ArithmeticException("Процент скидки должен быть от 0 до 100");
        }
        return (double) a - a * b / 100;
    }
}