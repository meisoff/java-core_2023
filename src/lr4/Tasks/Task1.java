package lr4.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        List <Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числовые элементы массива (окончание - y): ");
        while (!scanner.hasNext(Pattern.compile("y"))) {
            try {
                // Проверяем что ввелось число
                var data = Integer.parseInt(scanner.next());
                // Проверяем что положительное
                if (data < 0) {
                    throw new ArithmeticException();
                }
                // Проверяем что тип числа соответствует
                arrayList.add(data);
            }
            catch (ArithmeticException a) {
                System.out.println("Ввели отрицательное число");
            }

            catch (NumberFormatException e) {
                System.out.println("Ввели тип отличный от int");
            }

        }
        System.out.println("Успешно закончилась");
    }
}

//–	ввод строки вместо числа;
//–	несоответствие числового типа данных;
//–	положительные элементы отсутствуют.

