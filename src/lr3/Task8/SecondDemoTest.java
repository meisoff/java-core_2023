package lr3.Task8;

public class SecondDemoTest {
    public static void main(String[] args) {
        LinkedListRecursion list = new LinkedListRecursion();
        LinkedListRecursion list1 = new LinkedListRecursion();

        list.createHeadRec();
        var res = list.toStringRec();
        System.out.println(res);

        list1.createTailRec();
        res = list1.toStringRec();
        System.out.println(res);
    }
}
