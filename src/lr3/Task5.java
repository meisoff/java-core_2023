package lr3;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "pear");
        map.put(5, "grape");
        map.put(6, "watermelon");
        map.put(7, "kiwi");
        map.put(8, "pineapple");
        map.put(9, "mango");
        map.put(10, "papaya");

        String result = "";
        int product = 1;

        for (int key : map.keySet()) {
            String value = map.get(key);
            if (key > 5) {
                System.out.println("Ключ > 5: " + value);
            }
            if (key == 0) {
                result += value + ",";
            }
            if (value.length() > 5) {
                product *= key;
            }
        }

        if (!result.equals("")) {
            System.out.println("Ключ = 0: " + result.substring(0, result.length() - 1));
        }

        System.out.println("Продукты с длиной ключа > 5: " + product);
    }
}
