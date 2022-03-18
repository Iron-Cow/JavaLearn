import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
        /*
        * \\d -> one digit
        * \\w -> one english symbol == [a-zA-Z]
        * + -> 1 or more symbols
        * * -> 0 or more symbols
        * ? -> 0 or 1 symbols
        * (S|y|m) -> OR symbols (one of the symbols inside parentheses) (special symbols (+, ?...) should be leaded by \\
        * [a-zA-Z] -> more advanced OR symbol (this case for all english letters) [abc] = (a|b|c), [0-9] = \\d
        * [^abc] -> all symbols EXCEPT a OR b OR c
        * . -> any symbol
        *   Quantificators
        * {3} -> exactly 3 symbols, {3}\\d - 3 digits
        * {2, } -> 2+ symbols
        * {2, 4} -> 2 to 4 symbols (inclusive)
        *
        * */
        String a = "1234";
        System.out.println(a.matches("1234")); // true
        System.out.println(a.matches("1235")); // false

        System.out.println(a.matches("123\\d")); // true (123 + some digit)
        System.out.println(a.matches("12\\d+")); // true (12 + [1+ quantity]some digit )
        System.out.println(a.matches("12\\d+")); // true (12 + [0+]some digit )

        System.out.println("asdfAAA".matches("\\w*")); // true // any number of letters

        System.out.println("-123".matches("-?12\\d*")); // true (not required [-] + 12 + [0+]some digit )
        System.out.println("-123".matches("-?12\\d*")); // true (not required [-] + 12 + [0+]some digit )

        System.out.println("+123".matches("(\\+|-)12\\d+")); // true (not required [+ OR -] + 12 + [0+]some digit)
        System.out.println("-123".matches("(\\+|-)12\\d+")); // true (not required [+ OR -] + 12 + [0+]some digit)


        System.out.println("Hello123".matches("[a-zA-Z]+[0-9]+")); // true // some letters (required) + some digits (required)
        System.out.println("Hello123".matches("[^abc\\d]+[0-9]+")); // true // any symbols except abc OR digit (required) + some digits (required)
        System.out.println("Hello123".matches("[^abce\\d]+[0-9]+")); // false // any symbols except abce OR digit (required) + some digits (required)

        String helloRegexp = "H.llo123"; // . as any symbol
        System.out.println("Hello123".matches(helloRegexp)); // true // . as any symbol
        System.out.println("Hallo123".matches(helloRegexp)); // true // . as any symbol

        System.out.println("a!4Z".matches(".{4}")); // true // exactly 4 any
        System.out.println("12345".matches("\\d{3,6}")); // true // from 3 to 6 digits

        /////////// SPLIT

        String x = "Hello there hey";
        String[] words = x.split(" "); // regex here
        System.out.println(Arrays.toString(words)); /// [Hello, there, hey]


        /////////// REPLACE

        String b = "Hello11there2hey";
        String bReplace = b.replace("1", "."); // string as an old pattern
        System.out.println(bReplace); // Hello..there2hey

        String bReplaceAll = b.replaceAll("\\d+", "."); // regex as an old pattern
        System.out.println(bReplaceAll); // Hello.there.hey

        String bReplaceFirst = b.replaceFirst("\\d+", "."); // regex as an old pattern (ONLY first match)
        System.out.println(bReplaceFirst); // Hello.there2hey









    }
}
