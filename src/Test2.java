import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3); // 3 operations until open
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 3; i++){
            executorService.submit(new Processor2(i, countDownLatch));
        }
        executorService.shutdown();
        for (int i = 0; i < 3; i++){
            Thread.sleep(3000);
            countDownLatch.countDown();
        }

    }
}

class Processor2 implements Runnable{
    private int id;
    public CountDownLatch countDownLatch;

    public Processor2(int id, CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id " + id + " proceeded");
    }
}
        // execute almost in the same time due to latch
//        Thread with id 2 proceeded
//        Thread with id 0 proceeded
//        Thread with id 1 proceeded