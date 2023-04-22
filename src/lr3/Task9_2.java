package lr3;

import java.util.*;

public class Task9_2 {

    public static void main(String[] args) {
//        deleteFirst();
//        deleteMiddle();
        deleteLast();
    }

    public static void deleteFirst() {

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(i);
        }
        // Засекаем время для ArrayList
        long startTime = System.currentTimeMillis();
        // Удаляем 10_000_000 элементов из начала ArrayList
        while (arrayList.size() > 0) {
            arrayList.remove(0);
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration + " ms");
    }

    public static void deleteMiddle() {
        List<Integer> arrayList = new ArrayList<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 10_000_000; i++) {
            linkedHashMap.put(i, i);
        }
        int index;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            linkedHashMap.remove((int) Math.ceil(10_000_000 - i) / 2);
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("LinkedHashMap: " + duration + " ms");

        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(i);
        }
        startTime = System.currentTimeMillis();
        while (arrayList.size() > 2) {
            index = arrayList.size() / 2;
            arrayList.remove(index);
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration + " ms");
    }

    public static void deleteLast() {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {hashSet.add(i);}
        long startTime = System.currentTimeMillis();
        for (int i = 10_000_000; i > 0; i--) {hashSet.remove(i);}
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("HashSet: " + duration + " ms");

        for (int i = 0; i < 10_000_000; i++) {linkedHashMap.put(i, i);}
        startTime = System.currentTimeMillis();
        for (int i = 10_000_000; i > 0; i--) {linkedHashMap.remove(i, i);}
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("LinkedHashMap: " + duration + " ms");

        for (int i = 0; i < 10_000_000; i++) {arrayList.add(i);}
        startTime = System.currentTimeMillis();
        while (arrayList.size() > 0) {arrayList.remove(arrayList.size() - 1);}
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration + " ms");
    }

}

