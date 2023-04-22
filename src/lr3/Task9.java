package lr3;
import java.util.*;

public class Task9 {

    public static void main(String[] args) {
//        addFirst();
//        addMiddle();
//        addLast();
    }

    public static void addFirst() {
        List<Integer> arrayList = new ArrayList<>();
        // Засекаем время для ArrayList
        long startTime = System.currentTimeMillis();
        // Добавляем 10_000_000 элементов в начало ArrayList
        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration + " ms");
    }

    public static void addMiddle() {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        List<Integer> arrayList = new ArrayList<>();

        // Засекаем время для LinkedHashMap
        long startTime = System.currentTimeMillis();

        int index;
        // Добавляем 10_000_000 элементов в LinkedHashMap
        for (int i = 0; i < 10_000_000; i++) {
            index = linkedHashMap.size() / 2; // получаем индекс середины коллекции
            linkedHashMap.put(index, i);
        }

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("LinkedHashMap: " + duration + " ms");

        // Засекаем время для ArrayList
        startTime = System.currentTimeMillis();

        // Добавляем 10_000_000 элементов в ArrayList
        for (int i = 0; i < 10_000_000; i++) {
            index = arrayList.size() / 2;
            arrayList.add(index, i);
        }

        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration + " ms");
    }

    public static void addLast() {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        List<Integer> arrayList = new ArrayList<>();

        // Засекаем время для HashSet
        long startTime = System.currentTimeMillis();

        // Добавляем 10_000_000 элементов в начало HashSet
        for (int i = 0; i < 10_000_000; i++) {
            hashSet.add(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("HashSet: " + duration + " ms");

        // Засекаем время для LinkedHashMap
        startTime = System.currentTimeMillis();

        // Добавляем 10_000_000 элементов в начало LinkedHashMap
        for (int i = 0; i < 10_000_000; i++) {
            linkedHashMap.put(i, i);
        }

        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("LinkedHashMap: " + duration + " ms");

        // Засекаем время для ArrayList
        startTime = System.currentTimeMillis();

        // Добавляем 10_000_000 элементов в начало ArrayList
        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(i);
        }

        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration + " ms");
    }

}

