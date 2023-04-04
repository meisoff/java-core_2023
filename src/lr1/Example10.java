package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        LocalDate currentDate = LocalDate.now(); // Получаем текущую дату
        int currentYear = currentDate.getYear(); // Получаем текущий год

        int age = currentYear - birthYear; // Вычисляем возраст пользователя

        System.out.println("Ваш возраст: " + age + " лет.");
    }
}

