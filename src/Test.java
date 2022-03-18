import java.util.Random;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() { // like Runnable, but with returning value
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");
                Random random = new Random();
                int value = random.nextInt(10);
                if (value < 7){
                    throw new Exception("Something bas happened (to catch error)");
                }
                return value;
            }
        });
        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            int result = future.get(); // returning result (waits for result) from Callable
            System.out.println(result);

//            Starting
//            Finished
//            8

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            // our custom exception catch
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
//            Starting
//            Finished
//            Something bas happened (to catch error)

        }
    }
    public static int calculate(){
        return 5 + 4;
    }
}
