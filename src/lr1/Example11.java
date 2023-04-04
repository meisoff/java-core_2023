package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        LocalDate currentDate = LocalDate.now(); // Получаем текущую дату
        int currentYear = currentDate.getYear(); // Получаем текущий год

        int age = currentYear - birthYear; // Вычисляем возраст пользователя

        System.out.println(name + ", ваш возраст: " + age + " лет.");
    }
}