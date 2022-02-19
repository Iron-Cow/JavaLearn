public class ForLoop {
    public static void main(String[] args) {
//        (iterable value; while condition; iterable change per loop)
        for (int i = 0; i <= 6; i++) {  // i++ the same as i = i + 1
            System.out.println("Hello " + i);
        }
//        Output:

//        Hello 0
//        Hello 1
//        Hello 2
//        Hello 3
//        Hello 4
//        Hello 5
//        Hello 6

        for (int i = 10; i > 3; i--) {
            System.out.println("Hello " + i);
        }
//        Output:

//        Hello 10
//        Hello 9
//        Hello 8
//        Hello 7
//        Hello 6
//        Hello 5
//        Hello 4

        for (double i = -5.5; i <= 6; i = i + 2) {
            System.out.println("Bue " + i);
        }
//        Output:

//        Bue -5.5
//        Bue -3.5
//        Bue -1.5
//        Bue 0.5
//        Bue 2.5
//        Bue 4.5
    }
}
