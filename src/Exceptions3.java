import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        // Checked Exceptions (Compile time exception) == except cases
        // Unchecked Exceptions (Runtime exception)  == error case


        /// Checked Exceptions
//        File file = new File("test");
//        Scanner scanner = new Scanner(file);

            // solution
        File file = new File("test");
        try{
            Scanner scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            System.out.println("Not found");
        }


        /// Unchecked Exceptions
//        int a = 1 / 0; // error will be thrown while program run

//        Not found
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at Exceptions3.main(Exceptions3.java:25)

//        String name = null;
//        name.length(); // again - compilation will be successful but error will come later




    }
}
