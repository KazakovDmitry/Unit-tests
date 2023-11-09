package seminar2;

public class FactorialCalculator {
    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
