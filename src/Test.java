import java.util.Random;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1000_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) { // catch thread.interrupt(); command
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    System.out.println(Math.sin(random.nextDouble()));
                }
            }
        });
        System.out.println("Starting Thread");
        thread.start();

        Thread.sleep(1000);
        thread.interrupt();

        thread.join(); // interrupt should be called before join
        System.out.println("Finishing Thread");
    }
}
