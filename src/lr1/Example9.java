package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String monthName = scanner.nextLine();

        System.out.print("Введите количество дней в месяце: ");
        int daysInMonth = scanner.nextInt();

        System.out.println(monthName + " содержит " + daysInMonth + " дней.");
    }
}
