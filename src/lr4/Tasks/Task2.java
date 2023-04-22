package lr4.Tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {

    /*

    В программе, где требуется из матрицы вывести столбец с номером,
    заданным с клавиатуры, могут возникать ошибки в следующих случаях:
        –ввод строки вместо числа;
        –нет столбца с таким номером.

     */

    public static void main(String[] args) {

        int rows = 5;
        int cols = 5;
        int[][] testArray = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                testArray[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Чтобы закончить программу введите - y");
        System.out.println("Вводите номера столбцов для вывода элементов: ");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext(Pattern.compile("y"))) {

            try {
                int index = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < rows; i++) {
                    System.out.print(testArray[i][index] + " ");
                }
                System.out.println();
            }
            catch (NumberFormatException n) {
                System.out.println("ввод строки вместо числа");
            }
            catch (IndexOutOfBoundsException i) {
                System.out.println("нет столбца с таким номером");
            }
        }
    }
}
