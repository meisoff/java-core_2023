package lr3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public class Task9_3 {

    public static void main(String[] args) {
        searchElement();
    }

    public static void searchElement() {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1e7; i++) {hashSet.add(i);}
        long startTime = System.currentTimeMillis();
        // Получаем 1e10 элементов
        for (int i = 0; i < 1e3; i++) {
            for (int j = 0; j < 1e7; j++) {hashSet.contains(j);}
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("HashSet: " + duration + " ms");
        for (int i = 0; i < 1e7; i++) {linkedHashMap.put(i, i);}
        startTime = System.currentTimeMillis();
        // Получаем 1e10 элементов
        for (int i = 0; i < 1e3; i++) {
            for (int j = 0; j < 1e7; j++) {linkedHashMap.containsKey(j);}
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("LinkedHashMap: " + duration + " ms");
        for (int i = 0; i < 1e7; i++) {arrayList.add(i);}
        startTime = System.currentTimeMillis();
        // Получаем 1e10 элементов
        for (int i = 0; i < 1e3; i++) {
            for (int j = 0; j < 1e7; j++) {arrayList.get(j);}
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration + " ms");
    }

}

