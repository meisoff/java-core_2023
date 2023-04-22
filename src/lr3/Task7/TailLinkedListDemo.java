package lr3.Task7;

public class TailLinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Node tail = new Node(10);
        list.head = tail;

        tail.next = new Node(20);
        tail = tail.next;

        tail.next = new Node(30);
        tail = tail.next;

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
    }
}
