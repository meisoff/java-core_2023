package lr3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("Введите число для конвертации в двоичную систему: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        converter(number);
        System.out.printf("Число в двоичной системе: %s", converted);
    }

    public static String converted = "";

    public static String converter(int num) {
        if(num == 1) {
          return converted += 1;
        } else {
            converter(num / 2);
            return converted += num % 2;
        }
    }

}
