interface Executable2{ // change return value type
    int execute(int x);
}
class Runner2{
    public void run(Executable2 e){
        int result = e.execute(10);
        System.out.println(result);
    }
}

class ExecutableImplementation2 implements Executable2{
    @Override
    public int execute(int x) {
        System.out.println("Hello from executable");
        return x + 5;
    }
}

public class Test2 {
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


        ///


        Runner2 runner = new Runner2();
        runner.run(new ExecutableImplementation2()); // first way
        runner.run(new Executable2() {
            @Override
            public int execute(int x) {
                System.out.println("Hello from anonymous executable");
                return x + 10;
            }
        }); // second way
        final int a = 600;

        // NO this inside lambda functions
        runner.run((x) -> { // type can be skipped
            System.out.println("Hello from lambda executable");
            return x + 3 + a; // we can use variables from outside the function BUT only final or not changed (effectively final)
        }); // third way // multiline lambda
        // if only return - we can use () -> 3; // which means return 3
    }


}

//    Hello from executable
//    15
//    Hello from anonymous executable
//    20
//    Hello from lambda executable
//    613