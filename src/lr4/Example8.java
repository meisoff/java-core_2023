package lr4;

public class Example8 {
    public static int start() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        }
        catch (RuntimeException e) {
            System.out.println("Исправил");
            return 2;
        }
        finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(start());
    }

}
