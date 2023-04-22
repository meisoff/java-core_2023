package lr3.Task8;

public class FirstDemoTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Создаем с головы
        list.createHead();
        var res = list.toString();
        System.out.println(res);

        // Создаем с хвоста
        list.createTail();
        res = list.toString();
        System.out.println(res);

        // Добавляем в начало списка
        list.addFirst(5);
        System.out.printf("Добавили first 5 - %s\n", list.toString());
        // Добавляем в конец списка
        list.addLast(55);
        System.out.printf("Добавили last 55 - %s\n", list.toString());
        // Добавляем по индексу
        list.insert(100, 2);
        System.out.printf("Добавили 100 по ID=2 - %s\n", list.toString());
        // Удаляем с начала
        list.removeFirst();
        System.out.printf("Удалили first - %s\n", list.toString());
        // Удаляем с конца
        list.removeLast();
        System.out.printf("Удалили last - %s\n", list.toString());
        // Удаляем по индексу
        list.remove(3);
        System.out.printf("Удалили ID=3 - %s\n", list.toString());

    }
}
