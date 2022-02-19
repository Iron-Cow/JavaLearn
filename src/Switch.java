import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();

//        if(age = 16){
//            System.out.println("You finished school");
//        }else if (age = 60) {
//            System.out.println("You've become a senior");
//        }//...
        switch (age){
            case 0:
                System.out.println("You were born");
                break;
            case 16:
                System.out.println("You finished the school");
                break;
            case 60:
                System.out.println("You've become a senior");
                break;
            default:
                System.out.println("Something happened...");
        }
    }
}
//
//Output(s)
//
//    Please enter your age:
//    60
//    You've become a senior
//
//    Please enter your age:
//    16
//    You finished the school
//
//    Please enter your age:
//    333
//    Something happened...
//
//    Please enter your age:
//    0
//    You were born
