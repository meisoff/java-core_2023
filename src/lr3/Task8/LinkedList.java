package lr3.Task8;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinkedList {
    Node head;

    // Создание списка с головы
    void createHead() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка (окончание ввода - любое нечисловое значение): ");
        while (scanner.hasNextInt()) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    // Создание списка с хвоста
    void createTail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка (окончание ввода - любое нечисловое значение): ");
        Node tail = null;
        while (scanner.hasNextInt()) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (tail == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
    }

    // Вывод списка
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            sb.append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    // Добавление элемента в начало списка
    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Добавление элемента в конец списка
    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Вставка элемента в список с указанным номером
    void insert(int data, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException();
                }
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Удаление элемента с головы списка
    void removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        head = head.next;
    }

    // Удаление последнего элемента списка
    void removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Удаление из списка элемента с указанным номером
    void remove(int index) {
        Node current = head;
        int k = 1;
        // поиск положения узла, предшествующего удаляемому
        while (current.next != null && (k < index)) {
            current = current.next;
            k++;
        }
        // переброска ссылки для исключения ненужного элемента из списка

        assert current.next != null;
        current.next = current.next.next;

    }
}

