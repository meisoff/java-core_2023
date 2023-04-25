package lr5;

public class Example6 {
    private static final Object lock = new Object();
    final static int[] arrList = new int[] {13, 333, 222, 145, 16, 161, 24, 42};
    private static int number = arrList.length;
    private static int sum = 0;
    public static void main(String[] args) throws InterruptedException {

        Thread threadOne = new Thread(() -> {
            synchronized (lock) {
                while (number != 0) {
                    if (number % 2 == 0) {
                        System.out.println((Thread.currentThread().getName() + ": " + arrList[number - 1]));
                        sum += arrList[number - 1];
                        number--;
                    } else {
                        try {
                            Thread.sleep(500);
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        Thread threadTwo = new Thread(() -> {
            synchronized (lock) {
                while (number != 0) {
                    if (number % 2 != 0) {
                        System.out.println((Thread.currentThread().getName() + ": " + arrList[number - 1]));
                        sum += arrList[number - 1];
                        number--;
                    } else {
                        try {
                            Thread.sleep(500);
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        threadOne.setName("Thread-1");
        threadTwo.setName("Thread-2");

        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.printf("Сумма чисел - %s\n", sum);

    }
}

