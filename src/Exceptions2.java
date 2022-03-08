import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws IOException, ScannerException, ScannerExceptionWithDescription {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x == 0) {
                throw new IOException(); // manual exception call
            }else if (x == 14){
                throw new ScannerException();
            }else if (x == 11){
                throw new ScannerExceptionWithDescription("11 is causing error with description");
            }
        }
//        1
//        9
//        0
//        Exception in thread "main" java.io.IOException
//        at Exceptions2.main(Exceptions2.java:10)


//        1
//        3
//        8
//        14
//        Exception in thread "main" ScannerException
//        at Exceptions2.main(Exceptions2.java:12)


//        4
//        12
//        11
//        Exception in thread "main" ScannerExceptionWithDescription: 11 is causing error with description
//        at Exceptions2.main(Exceptions2.java:14)
    }
}
