package lr4;

public class Example12 {

    public static void start(String str, double chislo) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        start(null, 0.01);
    }

}
