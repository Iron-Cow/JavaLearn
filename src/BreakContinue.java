public class BreakContinue {
    public static void main(String[] args) {
//        break - cuts whole loop
//        continue - breaks current iteration and starts new one
        int i = 0;
        while (true){
            i++;
            if (i % 2 == 0){  // skip even numbers
                continue;
            }
            else if (i > 7){
                break;
            }
            System.out.println(i);
        }
        System.out.println("We exited the loop");
    }
}

//Output:
//
//        1
//        3
//        5
//        7
//        We exited the loop