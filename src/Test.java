public class Test {
    public static void main(String[] args) throws InterruptedException {
        // multithreading in java - virtual parallel
        // by switching between processes
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.sleep(3000);
        System.out.println("Thread is sleep");


//        System.out.println("Hello from Main Thread");
        // threads sync not guaranteed

        MyThread myThread2 = new MyThread();
        myThread2.start();
        Thread thread3 = new Thread(new Runner()); // 1 more way to create threads
    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}