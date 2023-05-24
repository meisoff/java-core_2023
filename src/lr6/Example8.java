package lr6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example8 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        int num = 905;

        List<Integer> integersAfter = bolsheList(integers, num);

        System.out.println("\n" + "Список после возведения в квадрат: " + "\n");

        for (Integer i: integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> bolsheList(List<Integer> list, int num) {
        return list.stream()
                .filter(x -> x > num)
                .collect(Collectors.toList());
    }
}
