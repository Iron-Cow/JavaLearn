import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "Hello, Guys! I sent you my email test@gmail.com so we can\n" +
        "keep in touch. Pleas check your receiver@gov.ua mail for the news!";

        // factory method
        Pattern email = Pattern.compile("\\w+@(gmail|gov)\\.(com|ua)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
            // test@gmail.com
            // receiver@gov.ua

            System.out.println(matcher.group(0));
            // test@gmail.com
            // receiver@gov.ua

            System.out.println(matcher.group(1));
            // gmail
            // gov

            System.out.println(matcher.group(2));
            // com
            // ua

        }

    }
}

// groups types

//          1       2       3
//          ()      ()      ()


//                    1
//                   2  3
//                  (() ())


//                   1
//                   2  3
//                  (()) ()



