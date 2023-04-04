package lr1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int prevNumber = number - 1;
        int nextNumber = number + 1;
        int fourthNumber = (number + prevNumber + nextNumber) * (number + prevNumber + nextNumber);

        System.out.println(prevNumber + ", " + number + ", " + nextNumber + ", " + fourthNumber);
    }
}

