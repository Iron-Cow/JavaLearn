import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread{
    // cache coherence case. running variable can be cached on one cpu,
    // but change trigger will appear on another.
    // Add volatile to avoid it. Grands va
    private volatile boolean running = true;


    @Override
    public void run() {
        while (running){
            System.out.println("Hello" + System.nanoTime());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}