package lr3.task1;

import java.util.Scanner;

public class RecursionV5 {
    public static void main(String[] args) {
        System.out.print("Введите число до которого считать: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for(int i = 0; i <= value; i++) {
            System.out.println(fact(i));
        }
    }

    public static int fact(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact (n - 2) + fact(n - 1);
        }
    }
}


