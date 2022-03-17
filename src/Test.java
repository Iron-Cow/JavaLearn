import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// ways to avoid deadlocks
// 1. try to lock/unlock locks in same order (takeLocks method)
// 2. if such logic required in app - use ReentrantLock / tryLock


public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class Runner{
    private final Account account1 = new Account();
    private final Account account2 = new Account();

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1, Lock lock2) throws InterruptedException {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken & secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            Thread.sleep(1);
        }
    }

    public void firstThread() throws InterruptedException {
        Random random = new Random();
//        for (int i = 0; i < 10000; i++) {
//            synchronized (account1){ // synchronized approach
//                synchronized (account2){ // make sure, that 2 account monitors available
//                    Account.transfer(account1, account2, random.nextInt(100));
//                }
//            }
//        }

        for (int i = 0; i < 10000; i++) {
            takeLocks(lock1, lock2); // same result // order of locks usually MATTERS!!!!!! to avoid deadlocks
            try{
                Account.transfer(account1, account2, random.nextInt(100));
            }
            finally {
                lock1.unlock();
                lock2.unlock();
            }
        }

    }
    public void secondThread() throws InterruptedException {
        Random random = new Random();
//        for (int i = 0; i < 10000; i++) {
//            synchronized (account1){
//                synchronized (account2) { // total sum will not be changed in time
//                    Account.transfer(account2, account1, random.nextInt(100));
//                }
//            }
//        }
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock2, lock1);
            try{
                        Account.transfer(account2, account1, random.nextInt(100));
                    }
                    finally {
                        lock1.unlock();
                        lock2.unlock();
                    }
        }
    }
    public void finished(){
        System.out.println("Acc1 balance -> " + account1.getBalance());
        System.out.println("Acc2 balance -> " + account2.getBalance());
        System.out.println("Total balance -> " + (account1.getBalance() + account2.getBalance()));
    }
}

class Account{
    private int balance = 10000;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount){
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}