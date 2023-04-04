package lr2;


public class Example2 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 4;
        int[][] snakeArray = new int[rows][cols];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    snakeArray[i][j] = value;
                    value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    snakeArray[i][j] = value;
                    value++;
                }
            }
        }

        // вывод массива на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
