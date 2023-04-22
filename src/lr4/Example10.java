package lr4;

public class Example10 {
    public static int start() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20; // Почему у этого ретёрна больше приоритет? Из-за того что последний вызывается?
        }
    }

    public static void main(String[] args) {
        System.out.println(start());
    }

}
