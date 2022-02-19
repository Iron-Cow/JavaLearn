import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        String s = new String("asdfasdf"); // redundant
        String s = "asdfasdf"; // build-in (java.lang)
        Scanner sc = new Scanner(System.in); // should be imported (java.util)

        System.out.println("Input something: ");
        String userInput = sc.nextLine();
        System.out.println("You typed: >>>" + userInput);
//        Output:
//
//        Input something:
//        Hello java!!
//        You typed: >>>Hello java!!

    }
}
