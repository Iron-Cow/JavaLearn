public class ArraysOfStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // array of integers
        String[] strings = new String[3]; // array of string, size 3 (3 string-type objects)
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

//        Hello
//        Java

        // run over each element in array
        // old:
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

//        Hello
//        Bye
//        Java

        // better
        for (String el : strings) {
            System.out.println(el);
        }

//        Hello
//        Bye
//        Java

        // for each for numbers also works
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }

        int value = 0; // memory allocated
        String s; // only link created
        s = "sadfasdf"; // now memory allocated;


    }
}
