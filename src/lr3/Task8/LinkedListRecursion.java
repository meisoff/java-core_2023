package lr3.Task8;

import java.util.Scanner;

public class LinkedListRecursion {
    Node head;

    // Создание списка с головы
    void createHeadRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка (окончание ввода - любое нечисловое значение): ");
        if (scanner.hasNextInt()) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            createHeadRec();
        }
    }

    // Создание списка с хвоста
    void createTailRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка (окончание ввода - любое нечисловое значение): ");
        if (scanner.hasNextInt()) {
            createTailRec();
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    // Вывод списка
    public String toStringRec() {
        StringBuilder sb = new StringBuilder();
        Node current = head;

        if(current!=null) {
            sb.append(current.data);
            sb.append(" ");
            sb.append(toStringRec(current.next));
        }

        return sb.toString();
    }

    public String toStringRec(Node current) {
        StringBuilder sb = new StringBuilder();

        if(current!=null) {
            sb.append(current.data);
            sb.append(" ");
            sb.append(toStringRec(current.next));
        }

        return sb.toString();
    }
}
