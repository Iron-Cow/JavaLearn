import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();

        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify{
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started ...");
            wait(); // this.wait()  // call on this. object
                    // 1 - given intrinsic lock
                    // 2 - waiting notify call on this. object
//            wait(1000); // timeout of waiting ms
//            someOtherObject.wait(); // not default wait call (on other object)
            System.out.println("Producer thread resumed ...");
        }
    }
    public void consume() throws InterruptedException{
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this){
            System.out.println("Waiting for return key pressed ... ");
            scanner.nextLine();
            notify(); // awakening only 1 thread // does not give monitor if some code after notify appears
//            notifyAll(); // awakening all waiting threads
            Thread.sleep(2000);
            System.out.println("Sleep for 2 seconds ... ");

        }
    }

}

//        Producer thread started ...
//        Waiting for return key pressed ...
//
//        Producer thread resumed ...