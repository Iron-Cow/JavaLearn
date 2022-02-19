public class If {
    public static void main(String[] args) {
//        if (condition)  // condition true or false (boolean)
//        first match will be executed. All next checks in if/else if/else block will be skipped
        int a = 5;
        if (a == 4) {
            System.out.println("Correct");
        } else if (a == 5) {  // optional
            System.out.println("Correct CASE 2");
        } else {  // optional
            System.out.println("Anyway ...");
        }
    }

    // Output : Correct CASE 2
}
