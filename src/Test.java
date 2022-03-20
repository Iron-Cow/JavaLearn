interface Executable{
    void execute();
}
class Runner{
    public void run(Executable e){
        e.execute();
    }
}

class ExecutableImplementation implements Executable{
    @Override
    public void execute() {
        System.out.println("Hello from executable");
    }
}

public class Test {
    public static void main(String[] args) {
        // lambda expressions since java 8
        // alternative to anonymous classes

        // same thread functionality:

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        });

        Thread thread2 = new Thread(() -> System.out.println("Hello world"));


        /////////

        Runner runner = new Runner();
        runner.run(new ExecutableImplementation()); // first way
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello from anonymous executable");
            }
        }); // second way
        runner.run(() -> System.out.println("Hello from lambda executable")); // third way
    }
}

