public class Test {
    public static void main(String[] args) {
//        someMethod();
        counter(3);


        // 4! = 4 * 3 * 2 * 1
        // 4! = 4 * 3!
        System.out.println(factorial(4)); // 24
    }

    // endless recursion // ERROR
//    public static void someMethod(){
//        System.out.println("Hello");
//        someMethod();
//    }


    public static void counter(int n){
        if (n == 0){return;} // exit condition // required for any recursion
        System.out.println(n);
        counter(n - 1);
    }

    public static int factorial(int n){
        // 4! = 4 * 3 * 2 * 1
        // 4! = 4 * 3!
        // 4! = 4 * 3 * 2!
        // 4! = 4 * 3 * 2 * 1!


        if (n == 1){
            return 1;
        }else if (n < 0){
            return -1; // incorrect input
        }
        return n * factorial(n - 1);
    }


}
