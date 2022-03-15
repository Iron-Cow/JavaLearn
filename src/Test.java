import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }

}

class Worker{
    Object lock1 = new Object(); // object for synchronization
    Object lock2 = new Object();


    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    Random random = new Random();
    public /*synchronized*/ void addToList1() throws InterruptedException {
        synchronized (lock1) {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }
    }
    public /*synchronized*/ void addToList2() throws InterruptedException {
        synchronized (lock2) {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        }
    }
    public void work() {
        for (int i = 0; i < 1000; i++){
            try {
                addToList1();
                addToList2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();
//        work();
        // new block
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // end new block

        long after= System.currentTimeMillis();

        System.out.println("Program tooK:");
        System.out.print(after - before);
        System.out.println(" ms");
        System.out.println("List1 size: " + list1.size());
        System.out.println("List2 size: " + list2.size());
    }
}

// first approach
//        Program tooK:
//        2545 ms
//        List1 size: 1000
//        List2 size: 1000


// Threads approach (time x2)
//        Program tooK:
//        5134 ms
//        List1 size: 2000
//        List2 size: 2000

// lock objects approach
//        Program tooK:
//        2558 ms
//        List1 size: 2000
//        List2 size: 2000