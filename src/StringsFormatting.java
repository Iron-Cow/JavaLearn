//System.out.println(); - prints given string + adds \n symbol implicitly
//System.out.print(); - prints given string in cursor last location

// System.out.printf("text , %s", "insert value") - formatting the string by placing 2nd argument instead of %s
    // %s - string
    // %d - digit (int, float, ... )
        // %10d, -  number of places reserved for such digit  (digit placed on the right)
        // %-10d, - number of places reserved for such digit  (digit placed on the left)
    // %f
        // %.2f - round to 2nd decimal point
        // %[10][.5]f - format of possible combinations

public class StringsFormatting {
    public static void main(String[] args) {
        System.out.print("Hello\n");
        System.out.println("World");
        // same as
        System.out.println("Hello");
        System.out.println("World");

//      Hello
//      World

        // -------

        System.out.printf("text is %s!! END\n", "TEsT teST");   // text is TEsT teST!! END
        System.out.printf("text is %d attempt\n",  11);         // text is 11 attempt
        System.out.printf("text is %10d attempt\n", 100);       // text is        100 attempt
        System.out.printf("text is %10d attempt\n", 1034340);   // text is    1034340 attempt
        System.out.printf("text is %-10d attempt\n", 1034340);  // text is 1034340    attempt
        // (10 places for 100 -> (7 spaces + 100 as digit)


        System.out.printf("text is %f attempt\n",  11.125);         // text is 11.125000 attempt
        System.out.printf("text is %.2f attempt\n",  11.125);       // text is 11.13 attempt
        System.out.printf("text is %12.1f attempt\n",  11.125);     // text is         11.1 attempt
        System.out.printf("text is %-12.1f attempt\n",  11.125);    // text is 11.1         attempt

    }
}
