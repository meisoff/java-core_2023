package lr1;
import java.util.Scanner;
import java.time.LocalDate;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        LocalDate currentDate = LocalDate.now(); // Получаем текущую дату
        int currentYear = currentDate.getYear(); // Получаем текущий год

        int birthYear = currentYear - age; // Вычисляем год рождения

        System.out.println("Год вашего рождения: " + birthYear);
    }
}
