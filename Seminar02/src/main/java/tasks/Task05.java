package tasks;

/**
 * Напишите класс, конструктор которого принимает два массива:
 * массив значений и массив весов значений.
 * Класс должен содержать метод, который будет возвращать элемент
 * из первого массива случайным образом, с учётом его веса.
 * Пример:
 * Дан массив [1, 2, 3], и массив весов [1, 2, 10].
 * В среднем, значение «1» должно возвращаться в 2 раза реже,
 * чем значение «2» и в десять раз реже, чем значение «3».
 */
class RandomFromArray {
    double[] valuesMulty;
    int weightsAmount;

    public RandomFromArray(double[] values, int[] weights) {
        for (int weight : weights) {
            weightsAmount += weight;
        }
        valuesMulty = new double[weightsAmount];
        int j = 0;
        int weight = weights[j];
        for (int i = 0; i < weightsAmount; i++) {
            if (weight == 0) {
                j += 1;
                weight = weights[j];
            }
            valuesMulty[i] = values[j];
            weight -= 1;
        }
    }

    public double getRandom() {
        return valuesMulty[(int) (Math.random() * weightsAmount)];
    }
}

public class Task05 {


    public static void main(String[] args) {
        RandomFromArray random = new RandomFromArray(new double[]{1, 2, 3}, new int[]{1, 2, 10});
        int test = 13;
        for (int i = 0; i < test; ++i) {
            System.out.println(random.getRandom());
        }
    }
}