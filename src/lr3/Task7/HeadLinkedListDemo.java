package lr3.Task7;

public class HeadLinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
    }
}

