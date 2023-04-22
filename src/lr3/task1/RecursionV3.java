package lr3.task1;

public class RecursionV3 {

    public static int step = 0;

    public static void main(int x) {
        space();
        System.out.println("" + x + "->");
        step++;
        if ((2*x+1) < 20) {
            main(2 * x + 1);
        }
        step--;
        space();
        System.out.println("" + x + "<-");
    };

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        main(1);
    }
}
