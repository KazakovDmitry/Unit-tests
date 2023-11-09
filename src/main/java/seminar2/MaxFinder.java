package seminar2;

public class MaxFinder {
    public int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
