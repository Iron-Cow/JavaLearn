import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        System.out.println("Please insert 5:");
//        Scanner sc = new Scanner(System.in);
//        int value = sc.nextInt();
//        while (value != 5){
//            System.out.println("Please insert 5:");
//            value = sc.nextInt();
//        }
//        System.out.println("Thank you! Bye!");

        // problem above - code duplication. Solution:

        int value;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please insert 5:");
            value = sc.nextInt();
        } while (value != 5);
        System.out.println("Thank you! Bye!");
    }
}

//Output:
//
//        Please insert 5:
//        4
//        Please insert 5:
//        -1
//        Please insert 5:
//        5
//        Thank you! Bye!
