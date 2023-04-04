package lr2;

import java.util.Arrays;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив: " + Arrays.toString(array));

        int min = array[0];
        int[] indexes = new int[array.length];
        int indexCount = 0;

        // поиск минимального элемента и его индексов
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexes[0] = i;
                indexCount = 1;
            } else if (array[i] == min) {
                indexes[indexCount] = i;
                indexCount++;
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.print("Индексы минимального элемента: ");
        for (int i = 0; i < indexCount; i++) {
            System.out.print(indexes[i] + " ");
        }
    }
}
