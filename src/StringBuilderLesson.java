//objects in java: mutable / immutable

import java.util.Locale;

public class StringBuilderLesson {
    public static void main(String[] args) {
//        String - immutable object
        String x = "hello";
        String newString = x.toUpperCase(); // returns new string
        System.out.println(x); // hello
        System.out.println(newString); // HELLO

        String s1 = "Hello";
        String s2 = " my";
        String s3 = " friend";
        String sAll = s1+s2+s3; // (s1+s2) as new object + s3 will create newer object, which placed into sAll variable
        System.out.println(sAll); // Hello my friend

        //String builder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString()); // Hello

        sb.append(" my"); // same object (just mutated)
        sb.append(" friend"); // still same object
//        can be replaced with:
//        sb.append(" my").append(" friend")

        System.out.println(sb.toString()); // Hello my friend
    }
}
