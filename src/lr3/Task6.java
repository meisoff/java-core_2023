package lr3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        int N = 10; // количество людей
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // заполнение списков людьми
        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // удаление каждого второго человека из ArrayList
        int index = 0;
        while (arrayList.size() > 1) {
            index = (index + 1) % arrayList.size();
            arrayList.remove(index);
        }

        System.out.println("Победитель ArrayList: " + arrayList.get(0));

        // удаление каждого второго человека из LinkedList
        index = 0;
        while (linkedList.size() > 1) {
            index = (index + 1) % linkedList.size();
            linkedList.remove(index);
        }

        System.out.println("Победитель LinkedList: " + linkedList.get(0));
    }
}



