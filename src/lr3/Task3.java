package lr3;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        arr = new int[num];
        input(num - 1);
        output(0);
    }

    public static int[] arr;

    public static void input(int num) {
        Random random = new Random();
        if(num == 0) {
            arr[0] = random.nextInt(100);
        } else {
            input(num - 1);
            arr[num] = random.nextInt(100);
        }
    }

    public static void output(int ind) {
        if(ind < arr.length) {
            System.out.printf("По индексу %s число %s\n", ind, arr[ind]);
            output(ind + 1);
        }
    }
}
