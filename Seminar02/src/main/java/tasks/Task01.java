package tasks;

public class Task01 {

    /**
     * Возвращает минимальное значение из массива.
     * Не использовать стандартную библиотеку!
     */
    public static int min(int[] ints) {
        int minimal = ints[0];
        for (int num : ints) {
            if (num < minimal) {
                minimal = num;
            }
        }
        return minimal;
    }

    public static float average(int[] ints) {
        float sum = 0;
        int n = 0;
        for (int num : ints) {
            sum += num;
            ++n;
        }
        return sum / n;
    }

}
