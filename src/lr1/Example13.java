package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.println("Сумма двух чисел: " + sum);
    }
}
