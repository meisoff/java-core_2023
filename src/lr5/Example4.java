package lr5;

class JThread extends Thread {

    JThread(String name){
        super(name);
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }
}

public class Example4 {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        new JThread("JThread-1").start();
        new JThread("JThread-2").start();
        new JThread("JThread-3").start();
        new JThread("JThread-4").start();
        new JThread("JThread-5").start();
        new JThread("JThread-6").start();
        new JThread("JThread-7").start();
        new JThread("JThread-8").start();
        new JThread("JThread-9").start();
        new JThread("JThread-10").start();
    }

}
