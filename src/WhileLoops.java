public class WhileLoops {
    public static void main(String[] args) {
        boolean t = true;
        // boolean t = 5 > 3;  // returns true
        // boolean t = 5 > 6;  // returns false
        // boolean t = 5 == 5;  // returns true
        int value = 0;
        while (value < 5) {
            System.out.println("Hello " + value);
            value = value + 1;
        }
//        While loop:
//        Check condition in brackets -> if true - loop next round from body; if false - break the loop
//        Hello 0
//        Hello 1
//        Hello 2
//        Hello 3
//        Hello 4
    }
}
